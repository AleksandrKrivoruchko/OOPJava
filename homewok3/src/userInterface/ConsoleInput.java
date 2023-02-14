package userInterface;

import java.util.Scanner;

public class ConsoleInput implements IInput{

    @Override
    public String input() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        return str;
    }
}
