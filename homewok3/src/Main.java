import dataVerification.CheckInputData;
import repository.PersonsRepository;
import userInterface.*;
import model.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run();
    }
}