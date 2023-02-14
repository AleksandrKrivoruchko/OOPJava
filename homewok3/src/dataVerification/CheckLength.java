package dataVerification;

import java.util.List;

public class CheckLength  implements CheckData{
    private final int len = 6;
    private List<String> list;

    public CheckLength(String str) {
       list = List.of(str.trim().split(" "));
    }

    public List<String> getList() {
        return list;
    }

    @Override
    public int check() {
        return Integer.compare(list.size(), len);
    }
}
