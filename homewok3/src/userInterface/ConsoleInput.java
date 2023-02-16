package userInterface;

import java.util.Scanner;

public class ConsoleInput implements IInput<Scanner>{

    @Override
    public String input(Scanner sc) {
        String str = sc.nextLine();
        return str;
    }
}
