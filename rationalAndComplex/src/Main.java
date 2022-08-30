import interfaceRCNumber.CreateNumber;
import interfaceRCNumber.OperationsWithRC;
import sourceMenu.Menu;
import sourceMenu.StartMenu;
import sourceNumber.*;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        menu.start();
        scanner.close();
    }
}
