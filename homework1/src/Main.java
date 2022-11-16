import methodsWithArrays.Task2;
import methodsWithArrays.Task3;
import metodsWithExceptions.RunApplication;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        RunApplication r = new RunApplication();
        r.run();
        System.out.println("Задача 2:");
        Task2 t2 = new Task2();
        t2.run();
        System.out.println("Задача 3:");
        Task3 t3 = new Task3();
        t3.run();
    }
}
