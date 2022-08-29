import interfaceRCNumber.CreateNumber;
import interfaceRCNumber.OperationsWithRC;
import source.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StartCalcs calcs = new StartCalcs();
        calcs.setModeWork(scanner);
        if (calcs.getModeWork() == 1) {
            CreateComplex ic = new CreateComplex(scanner);
            OperationsWithRC complex = ic.createNumber();
            OperationsWithRC complex1 = ic.createNumber();
            System.out.println(complex + " + " + complex1 + " = " + complex.sum(complex1));
            System.out.println(complex + " - " + complex1 + " = " + complex.sub(complex1));
            System.out.println(complex + " * " + complex1 + " = " + complex.mul(complex1));
            System.out.println(complex + " / " + complex1 + " = " + complex.div(complex1));

//            OperationsWithRC cn = new ComplexNumber(-2, 3);
//            System.out.println(cn);
//            OperationsWithRC cn1 = new ComplexNumber(3, -2);
//            System.out.println(cn + " + " + cn1 + " = " + cn.sum(cn1));
//            System.out.println(cn + " - " + cn1 + " = " + cn.sub(cn1));
//            System.out.println(cn + " * " + cn1 + " = " + cn.mul(cn1));
//            System.out.println(cn + " / " + cn1 + " = " + cn.div(cn1));
        } else {
            CreateNumber rational = new CreateRational(scanner);
            OperationsWithRC rn = (RationalNumber) rational.createNumber();
            System.out.println(rn);
            OperationsWithRC rn1 = (RationalNumber) rational.createNumber();
            System.out.println(rn1);
            int n = ((RationalNumber) rn1).greatestCommonDivisor(5, 7);
            System.out.println(n);
            OperationsWithRC rn2 = new RationalNumber(-12, 2);
            System.out.println(rn2);
            System.out.println(rn + " + " + rn1 + " = " + rn.sum(rn1));
            System.out.println(rn + " - " + rn1 + " = " + rn.sub(rn1));
            System.out.println(rn + " * " + rn1 + " = " + rn.mul(rn1));
            System.out.println(rn + " / " + rn1 + " = " + rn.div(rn1));
            System.out.println(rn + " * " + rn2 + " = " + rn.mul(rn2));
            System.out.println(rn + " / " + rn2 + " = " + rn.div(rn2));
        }
        scanner.close();
    }
}
