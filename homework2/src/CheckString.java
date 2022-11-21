import java.util.Scanner;

public class CheckString {
    public String inpuString(Scanner sc) {
        String str = sc.nextLine();
        if (str.isEmpty()) {
            throw new RuntimeException("Нельзя вводить пустые строки!");
        }
        return str;
    }
}
