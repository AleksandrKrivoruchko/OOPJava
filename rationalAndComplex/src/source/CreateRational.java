package source;

import interfaceRCNumber.CreateNumber;

import java.util.Scanner;

public class CreateRational implements CreateNumber<RationalNumber, Integer> {
    private Scanner scanner;

    public CreateRational(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
    public RationalNumber createNumber() {
        String numStr = "Введите числитель рационального числа";
        String dStr = "Введите знаменатель рационального числа не равный 0";
        int num = inputNumber(numStr);
        int d = inputNumber(dStr);
        while (d == 0) {
            System.out.printf("%d - не может быть знаменателем!");
            d = inputNumber(dStr);
        }
        return new RationalNumber(num, d);
    }

    @Override
    public Integer inputNumber(String str) {
        System.out.printf("%s: ", str);
        while (!scanner.hasNextInt()) {
            String tmp = scanner.next();
            System.out.println("tmp - это не число");
            System.out.printf("%s: ", str);
        }
        return scanner.nextInt();
    }
}
