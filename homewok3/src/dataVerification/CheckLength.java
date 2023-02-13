package dataVerification;

public class CheckLength  implements CheckData{
    private final int len = 6;
    private String[] list;

    public CheckLength(String str) {
        list = str.trim().split(" ");
    }

    public String[] getList() {
        return list;
    }

    @Override
    public int check() {
        return Integer.compare(list.length, len);
    }
}
