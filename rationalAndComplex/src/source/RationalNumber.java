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
        return null;
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
        if (num <= denominator) {
            return String.format("(%d/%d)", num, denominator);
        }
        int n = num / denominator;
        int d = num % denominator;
        return String.format("%d(%d/%d)", n, d, denominator);
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
}
