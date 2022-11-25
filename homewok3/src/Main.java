import personalData.CheckData;
import personalData.SplitInputString;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Фамилию Имя Отчество дату рождения номер телефона пол");
        String personData = sc.nextLine();
        SplitInputString sis = new SplitInputString(personData);
        List<String> ls = sis.getLs();
        CheckData cd = new CheckData();
        if(cd.checkCountStrings(ls) > 0) {
            System.out.println("Вы ввели слишком много данных");
            System.out.println(ls);
        }
        if(cd.checkCountStrings(ls) < 0) {
            System.out.println("Вы ввели мало данных");
            System.out.println(ls);
        }
    }
}