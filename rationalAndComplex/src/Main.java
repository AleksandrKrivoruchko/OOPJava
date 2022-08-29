import interfaceRCNumber.OperationsWithRC;
import source.ComplexNumber;
import source.InputComplex;
import source.RationalNumber;
import source.StartCalcs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StartCalcs calcs = new StartCalcs();
        calcs.setModeWork(scanner);
        InputComplex ic = new InputComplex(scanner);
        OperationsWithRC complex = ic.createNumber();
        System.out.println(complex);
        scanner.close();
        if (calcs.getModeWork() == 1) {
            OperationsWithRC cn = new ComplexNumber(-2, 3);
            System.out.println(cn);
            OperationsWithRC cn1 = new ComplexNumber(3, -2);
            System.out.println(cn + " + " + cn1 + " = " + cn.sum(cn1));
            System.out.println(cn + " - " + cn1 + " = " + cn.sub(cn1));
            System.out.println(cn + " * " + cn1 + " = " + cn.mul(cn1));
            System.out.println(cn + " / " + cn1 + " = " + cn.div(cn1));
        } else {
            OperationsWithRC rn = new RationalNumber(1, 3);
            System.out.println(rn);
            OperationsWithRC rn1 = new RationalNumber(3, 2);
            System.out.println(rn1);
            int n = ((RationalNumber) rn1).greatestCommonDivisor(5, 7);
            System.out.println(n);
            OperationsWithRC rn2 = new RationalNumber(-12, 2);
            System.out.println(rn2);
            System.out.println(rn + " + " + rn1 + " = " + rn.sum(rn1));
            System.out.println(rn + " - " + rn1 + " = " + rn.sub(rn1));
            System.out.println(rn + " * " + rn1 + " = " + rn.mul(rn1));
            System.out.println(rn + " * " + rn2 + " = " + rn.mul(rn2));
            System.out.println(rn + " / " + rn2 + " = " + rn.div(rn2));
        }
    }
}
