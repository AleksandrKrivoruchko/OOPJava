package source;

import interfaceRCNumber.*;

public class RationalNumber implements SumRC<RationalNumber>, SubRC<RationalNumber>,
        MulRC<RationalNumber>, DivRC<RationalNumber> {
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
        if (this.denominator == t.denominator) {
            int tmp = this.num + t.num;
            return new RationalNumber(tmp, t.denominator);
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
    public RationalNumber div(RationalNumber rationalNumber) {
        return null;
    }

    @Override
    public RationalNumber mul(RationalNumber rationalNumber) {
        return null;
    }

    @Override
    public RationalNumber sub(RationalNumber rationalNumber) {
        return null;
    }

    @Override
    public String toString(){
        if (denominator == 1) {
            return String.format("%d", num);
        }
        if (num <= denominator) {
            int tmp = greatestCommonDivisor(num, denominator);
            return String.format("(%d/%d)", num / tmp, denominator / tmp);
        }
        int n = num / denominator;
        int d = num % denominator;
        if (d == 0) {
            return String.format("%d", n);
        }
        int tmp = greatestCommonDivisor(denominator, d);
        return String.format("%d(%d/%d)", n , d / tmp, denominator / tmp);
    }

    public int greatestCommonDivisor(int n, int d) {
        if (n == d) {
            return n;
        }
        while (n != 0 && d != 0) {
            if (n > d) {
                n = n - d;
            } else {
                d = d - n;
            }
        }
        return n + d;
    }

    public RationalNumber mulByInt(RationalNumber rn, int n) {
        if (rn.denominator % n == 0) {
            return new RationalNumber(rn.getNum(), rn.getDenominator() / n);
        }
        return new RationalNumber(rn.getNum() * n, rn.getDenominator());
    }
}
