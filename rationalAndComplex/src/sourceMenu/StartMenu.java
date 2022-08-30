package sourceMenu;

import java.util.Scanner;

public class StartMenu {
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
            } else {
                modeWork = 0;
            }
        } else {
            modeWork = 0;
        }
        if (modeWork == 0) {
            System.exit(0);
        }
    }
}
