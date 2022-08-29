package source;

import interfaceRCNumber.*;

public class RationalNumber implements OperationsWithRC<RationalNumber> {
    private int num;
    private int denominator;

    public RationalNumber(int num, int denominator) {
        this.num = num;
        this.denominator = denominator;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public RationalNumber sum(RationalNumber t) {
        if (this.denominator == t.getDenominator()) {
            int tmp = this.num + t.getNum();
            return new RationalNumber(tmp, t.getDenominator());
        }
        int gcd = t.greatestCommonDivisor(this.denominator, t.getDenominator());
        if (gcd == 1) {
            int tmpN = this.num * t.getDenominator() + t.getNum() * this.denominator;
            return new RationalNumber(tmpN, this.denominator * t.getDenominator());
        }
        int tmpN = t.getDenominator() / gcd * this.num + this.denominator / gcd * t.getNum();
        int tmpD = (t.denominator / gcd) * (this.denominator / gcd);
        return new RationalNumber(tmpN, tmpD);
    }

    @Override
    public RationalNumber div(RationalNumber t) {
        return new RationalNumber(this.num * t.getDenominator(),
                this.denominator * t.getNum());
    }

    @Override
    public RationalNumber mul(RationalNumber t) {
        return new RationalNumber(this.num * t.getNum(),
                this.denominator * t.getDenominator());
    }

    @Override
    public RationalNumber sub(RationalNumber t) {
        if (this.denominator == t.denominator) {
            int tmp = this.num - t.num;
            return new RationalNumber(tmp, t.denominator);
        }
        int gcd = t.greatestCommonDivisor(this.denominator, t.getDenominator());
        if (gcd == 1) {
            int tmpN = this.num * t.getDenominator() - t.getNum() * this.denominator;
            return new RationalNumber(tmpN, this.denominator * t.getDenominator());
        }
        int tmpN = t.getDenominator() / gcd * this.num - this.denominator / gcd * t.getNum();
        int tmpD = (t.denominator / gcd) * (this.denominator / gcd);
        return new RationalNumber(tmpN, tmpD);
    }

    @Override
    public String toString() {
        if (isNegative()) {
            num = -Math.abs(num);
        } else {
            num = Math.abs(num);
        }
        denominator = Math.abs(denominator);
        if (denominator == 1) {
            return String.format("%d", num);
        }
        if (Math.abs(num) <= Math.abs(denominator)) {
            int tmp = greatestCommonDivisor(num, denominator);
            return String.format("(%d/%d)", num / tmp, denominator / tmp);
        }
        int n = num / denominator;
        int d = num % denominator;
        if (d == 0) {
            return String.format("%d", n);
        }
        d = Math.abs(d);
        int tmp = greatestCommonDivisor(denominator, d);
        return String.format("%d(%d/%d)", n, d / tmp, denominator / tmp);
    }

    public int greatestCommonDivisor(int n, int d) {
        n = Math.abs(n);
        d = Math.abs(d);
        if (n == d) {
            return n;
        }
        while (n != 0 && d != 0) {
            if (n > d) {
                n = n % d;
            } else {
                d = d % n;
            }
        }
        return n + d;
    }

    public boolean isNegative() {
        boolean b = false;
        if (num < 0 && denominator < 0) {
            return false;
        }
        if (num < 0 || denominator < 0) {
            b = true;
        }
        return b;
    }

}
