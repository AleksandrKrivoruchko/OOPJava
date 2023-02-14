import dataVerification.CheckData;
import dataVerification.CheckDate;
import dataVerification.CheckLength;
import userInterface.ConsoleInput;
import userInterface.ConsoleOutput;
import userInterface.IInput;
import userInterface.IOutput;

public class Main {
    public static void main(String[] args) {
        IOutput output = new ConsoleOutput();
        output.print("Введите Фамилию Имя Отчество дату рождения номер телефона пол\n");
        output.print(">>");
        IInput input = new ConsoleInput();
        String str = input.input();
        output.print(str + "\n");
        System.out.println(CheckDate.isDate(str));
    }
}