import sourceMenu.Menu;

import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Main {
    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(Main.class
                    .getResourceAsStream("logging.properties"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        Logger log = Logger.getLogger(Main.class.getName());
        log.log(INFO, "log message");
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        menu.start();
        scanner.close();

    }
}
