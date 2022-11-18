import java.util.Scanner;

public class FloatInput {
    public float inputFloat() {
        Scanner sc = new Scanner(System.in);
        String msg = "Введите дробное число:";

        printMessage(msg);

        float f = 0;
        while (!sc.hasNextFloat()) {
            sc.nextLine();
            printMessage(msg);
        }
        f = sc.nextFloat();

        sc.close();
        return f;
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}