package source;

import java.util.Scanner;

public class StartCalcs {
    final String startStr = """
            Для вычислений с комплекснымми числами введите 1
            Для вычислений с рациональными числами введите 2
            Для выхода из программы введите q
            """;
    private int modeWork = 0;

    public int getModeWork() {
        return modeWork;
    }

    public void setModeWork(Scanner scanner) {
        System.out.print(startStr);
        if (scanner.hasNextInt()) {
            int tmp = scanner.nextInt();
            if (tmp == 1 || tmp == 2) {
                modeWork = tmp;
            }
        }
        if (modeWork == 0) {
            System.exit(0);
        }
    }
}
