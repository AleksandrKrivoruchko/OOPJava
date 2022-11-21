import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Задача 1
        {
            System.out.println(" Задача 1");
            FloatInput fInput = new FloatInput();
            float f = fInput.inputFloat(sc);
            sc.nextLine();
            System.out.println("Вы ввели " + f + "\n");
        }

        // Задача 2
        {
            int[] intArray = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
            // Если нужно получить исключение, ничего не меняем
            try {
                int d = 0;
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.out.println("Catching exception: " + e);
            }
            // Если нужен результат ,не равный Infinity
            // d != 0 && (double catchedRes1 = (double) intArray[8] / d ||
            // double catchedRes1 = intArray[8] / (double) d)
            // либо d != 0 && int catcheRes1 = intArray[8] / d
            // если нужно целочисленное деление.

        }

        // Задача 3
        {
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                abc[3] = 9;
            } catch (Throwable ex) {
                System.out.println("Что-то пошло не так...");
            } // catch (NullPointerException ex) {
              // System.out.println("Указатель не может указывать на null!");
              // } catch (IndexOutOfBoundsException ex) {
              // System.out.println("Массив выходит за пределы своего размера");
              // }

            // или
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                abc[3] = 9;
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера");
            }
        }

        // Задача 4
        {
            System.out.println("Задача 4");
            System.out.println("Введите строку:");
            CheckString cs = new CheckString();
            try {
                String str = cs.inpuString(sc);
                System.out.println(str);
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }
        }
        sc.close();

    }

    public static void printSum(Integer a, Integer b) {
        System.out.println((a + b));
    }
}
