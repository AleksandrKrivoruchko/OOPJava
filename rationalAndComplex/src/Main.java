import interfaceRCNumber.SumRC;
import source.ComplexNumber;
import source.RationalNumber;

public class Main {
    public static void main(String[] args) {
        ComplexNumber cn = new ComplexNumber(2, 3);
        System.out.println(cn);
        ComplexNumber cn1 = new ComplexNumber(3, -2);
        System.out.println(cn + " + " + cn1 + " = " + cn.sum(cn1));
        System.out.println(cn + " - " + cn1 + " = " + cn.sub(cn1));
        System.out.println(cn + " * " + cn1 + " = " + cn.mul(cn1));
        System.out.println(cn + " / " + cn1 + " = " + cn.div(cn1));
        RationalNumber rn = new RationalNumber(1, 3);
        System.out.println(rn);
        RationalNumber rn1 = new RationalNumber(3, 2);
        System.out.println(rn1);
        int n = rn1.greatestCommonDivisor(5, 7);
        System.out.println(n);
        SumRC rn2 = new RationalNumber(12, 2);
        System.out.println(rn2);
        System.out.println(rn + " + " + rn1 + " = " + rn.sum(rn1));
    }
}
