package userInterface;

import dataVerification.CheckInputData;
import model.Person;
import repository.PersonsRepository;

import java.util.Scanner;

public class Menu {
    public void run() {
        Scanner sc = new Scanner(System.in);
        IOutput output = new ConsoleOutput();
        output.print("Введите Фамилию Имя Отчество дату рождения номер телефона пол\n");
        output.print(">>");
        IInput input = new ConsoleInput();
        String str = input.input(sc);
        while (!str.isEmpty()) {
            CheckInputData data = CheckInputData.create();
            if (data.isPerson(str)) {
                PersonsRepository pr = data.getPr();
                for (Person p : pr.getListPersons()) {
                    System.out.println(p);
                }
            } else {
                System.out.println("Incorrect input");
            }
            output.print("Введите Фамилию Имя Отчество дату рождения номер телефона пол\n");
            output.print(">>");
            str = input.input(sc);
        }
        sc.close();
    }
}
