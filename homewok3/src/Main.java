import dataVerification.CheckInputData;
import repository.PersonsRepository;
import userInterface.ConsoleInput;
import userInterface.ConsoleOutput;
import userInterface.IInput;
import userInterface.IOutput;
import model.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IOutput output = new ConsoleOutput();
        output.print("Введите Фамилию Имя Отчество дату рождения номер телефона пол\n");
        output.print(">>");
        IInput input = new ConsoleInput();
        String str = input.input(sc);
//        output.print(str + "\n");
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