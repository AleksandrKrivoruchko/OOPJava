package sourceNumber;

import interfaceRCNumber.CreateNumber;

import java.util.Scanner;

public class CreateComplex implements CreateNumber<ComplexNumber, Double> {
    private Scanner scanner;

    public CreateComplex(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
    public Double inputNumber(String str) {
        System.out.printf("%s: ", str);
        while (!scanner.hasNextDouble()) {
            String tmp = scanner.next();
            System.out.printf("%s - это не число\n", tmp);
            System.out.printf("%s: ", str);
        }
        return scanner.nextDouble();
    }

    @Override
    public ComplexNumber createNumber() {
        String realStr = "Введите вещественную часть комплексного числа";
        String imStr = "Введите мнимую часть комплексного числа";
        double re = inputNumber(realStr);
        double im = inputNumber(imStr);
        return new ComplexNumber(re, im);
    }
}
