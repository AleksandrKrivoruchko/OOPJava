package sourceNumber;

import interfaceRCNumber.CreateNumber;

import java.util.Scanner;

public class CreateRational implements CreateNumber<RationalNumber, Integer> {
    private Scanner scanner;

    public CreateRational(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
    public RationalNumber createNumber() {
        String numStr = "Введите числитель, целое число";
        String dStr = "Введите знаменатель, целое число не равное 0";
        int num = inputNumber(numStr);
        int d = inputNumber(dStr);
        while (d == 0) {
            System.out.printf("%d - не может быть знаменателем!\n", d);
            d = inputNumber(dStr);
        }
        return new RationalNumber(num, d);
    }

    @Override
    public Integer inputNumber(String str) {
        System.out.printf("%s: ", str);
        while (!scanner.hasNextInt()) {
            String tmp = scanner.next();
            System.out.printf("%s - это не целое число\n", tmp);
            System.out.printf("%s: ", str);
        }
        return scanner.nextInt();
    }
}
