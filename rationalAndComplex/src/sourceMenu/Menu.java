package sourceMenu;

import interfaceRCNumber.Calc;
import interfaceRCNumber.CreateNumber;
import interfaceRCNumber.OperationsWithRC;
import sourceNumber.ComplexNumber;
import sourceNumber.CreateComplex;
import sourceNumber.CreateRational;
import sourceNumber.RationalNumber;

import java.util.Locale;
import java.util.Scanner;

public class Menu implements Calc<OperationsWithRC> {
    private Scanner scanner;
    private StartMenu menu;

    public Scanner getScanner() {
        return scanner;
    }

    public Menu(Scanner scanner) {
        this.scanner = scanner;
        this.menu = new StartMenu();
    }

    public void start() {
        menu.setModeWork(scanner);
        while (menu.getModeWork() != 0) {
            if (menu.getModeWork() == 1) {
                CreateComplex c = new CreateComplex(scanner);
                expression(c);
            } else {
                CreateRational r = new CreateRational(scanner);
                expression(r);
            }
            menu.setModeWork(scanner);
        }
    }

    private void expression(CreateNumber c) {
        String sign;
        OperationsWithRC a = (OperationsWithRC) c.createNumber();
        while (menu.getModeWork() != 0) {
            sign = getOperationSing();
            if (sign.equalsIgnoreCase("c")) {
//                menu.setModeWork(scanner);
                return;
            }
            OperationsWithRC b = (OperationsWithRC) c.createNumber();
            var t = calculation(a, b, sign);
            System.out.println(a + " " + sign + " " + b
                    + " = " + t);
            a = t;
        }
    }

    private String getOperationSing() {
        boolean b = false;
        String tmp = "";
        while (!b) {
            System.out.printf("Введите знак операции (+, -, *, /) или c для выхода\n");
            tmp = scanner.next();
            b = tmp.equals("+") || tmp.equals("-")
                    || tmp.equals("*") || tmp.equals("/")
                    || tmp.equalsIgnoreCase("c");
//            System.out.printf("Вы ввели %s\n", tmp);

        }
        return tmp;
    }

    @Override
    public OperationsWithRC calculation(OperationsWithRC a, OperationsWithRC b, String sing) {
        return switch (sing) {
            case "+" -> (OperationsWithRC) a.sum(b);
            case "-" -> (OperationsWithRC) a.sub(b);
            case "*" -> (OperationsWithRC) a.mul(b);
            case "/" -> (OperationsWithRC) a.div(b);
            default -> null;
        };
    }
}