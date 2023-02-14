import dataVerification.CheckInputData;
import repository.PersonsRepository;
import userInterface.ConsoleInput;
import userInterface.ConsoleOutput;
import userInterface.IInput;
import userInterface.IOutput;
import model.Person;

public class Main {
    public static void main(String[] args) {
        IOutput output = new ConsoleOutput();
        output.print("Введите Фамилию Имя Отчество дату рождения номер телефона пол\n");
        output.print(">>");
        IInput input = new ConsoleInput();
        String str = input.input();
        output.print(str + "\n");
        CheckInputData data = new CheckInputData();
        if (data.isPerson(str)) {
            PersonsRepository pr = data.getPr();
            for (Person p: pr.getListPersons()) {
                System.out.println(p);
            }
        } else {
            System.out.println("Incorrect input");
        }
    }
}