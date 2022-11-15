package metodsWithExceptions;

public class RunApplication {
    public void run() {
        Method1 m1 = new Method1();
        Method2 m2 = new Method2();
        Method3 m3 = new Method3();
        try {
            System.out.println(m1.div(10, 0));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            m3.throwException();
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            System.out.println(m2.sumArray(new int[]{1, 2, 3}));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
