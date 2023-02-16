package userInterface;

import java.util.Scanner;

public class ConsoleInput implements IInput<Scanner>{

    @Override
    public String input(Scanner sc) {
        return sc.nextLine();
    }
}
