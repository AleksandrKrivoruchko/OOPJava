package sourceMenu;

import interfaceRCNumber.Calc;
import interfaceRCNumber.CreateNumber;
import interfaceRCNumber.OperationsWithRC;
import sourceNumber.CreateComplex;
import sourceNumber.CreateRational;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu implements Calc<OperationsWithRC> {
    private Scanner scanner;
    private StartMenu menu;
    private Logger log = Logger.getLogger(Menu.class.getName());

    public Scanner getScanner() {
        return scanner;
    }

    public Menu(Scanner scanner) {
        this.scanner = scanner;
        this.menu = new StartMenu();
    }

    public void start() {
        log.log(Level.INFO, "Start choice");
        menu.setModeWork(scanner);
        while (menu.getModeWork() != 0) {
            if (menu.getModeWork() == 1) {
                CreateComplex c = new CreateComplex(scanner);
                log.log(Level.INFO, "ComplexNumber");
                expression(c);
            } else {
                CreateRational r = new CreateRational(scanner);
                log.log(Level.INFO, "RationalNumber");
                expression(r);
            }
            log.log(Level.INFO, "Return to the Start choice");
            menu.setModeWork(scanner);
        }
    }

    private void expression(CreateNumber c) {
        String sign;
        OperationsWithRC a = (OperationsWithRC) c.createNumber();
        while (true) {
            sign = getOperationSing();
            if (sign.equalsIgnoreCase("c")) {
                return;
            }
            OperationsWithRC b = (OperationsWithRC) c.createNumber();
            var t = calculation(a, b, sign);
            String tmpStr = String.format("%s %s %s = %s", a, sign, b, t);
            log.log(Level.INFO, tmpStr);
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
