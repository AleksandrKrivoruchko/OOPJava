import sourceMenu.Menu;

import java.util.Scanner;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class.getName());
        log.log(SEVERE, "log message");
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        log.info("new log");
        menu.start();
        scanner.close();

    }
}
