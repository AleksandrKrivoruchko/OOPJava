package userInterface;

public class ConsoleOutput implements IOutput{
    @Override
    public void print(String str) {
        System.out.print(str);
    }
}
