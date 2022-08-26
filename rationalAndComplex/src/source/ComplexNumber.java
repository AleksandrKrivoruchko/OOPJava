package source;

import interfaceRCNumber.*;

public class ComplexNumber implements SumRC<ComplexNumber>, SubRC<ComplexNumber>,
        MulRC<ComplexNumber>, DivRC<ComplexNumber> {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public ComplexNumber div(ComplexNumber num) {
        double r = (this.getReal() * num.getReal() +
                this.getImag() * num.getImag()) /
                (Math.pow(num.getReal(), 2) +
                        Math.pow(num.getImag(), 2));
        double im = (this.getImag() * num.getReal() -
                this.getReal() * num.getImag()) /
                (Math.pow(num.getReal(), 2) +
                        Math.pow(num.getImag(), 2));
        return new ComplexNumber(r, im);
    }

    @Override
    public ComplexNumber mul(ComplexNumber num) {
        double r = this.getReal() * num.getReal() -
                this.getImag() * num.getImag();
        double im = this.getReal() * num.getImag() +
                this.getImag() * num.getReal();
        return new ComplexNumber(r, im);
    }

    @Override
    public ComplexNumber sub(ComplexNumber num) {
        return new ComplexNumber(this.getReal() - num.getReal(),
                this.getImag() - num.getImag());
    }

    @Override
    public ComplexNumber sum(ComplexNumber num) {
        return new ComplexNumber(this.getReal() + num.getReal(),
                this.getImag() + num.getImag());
    }

    @Override
    public String toString() {
        return String.format("(%.2f + %.2fi)", real, imag);
    }
}
