package dataVerification;

import java.util.ArrayList;
import java.util.List;

public class CheckLength  implements CheckData{
    private final int len = 6;
    private List<String> list = new ArrayList<>();

    public CheckLength(String str) {
        SplitString(str);
    }

    private void SplitString(String str) {
        String[] strArray = str.trim().split(" ");
        for (int i = 0; i < strArray.length; i++) {
            String s = strArray[i].trim();
//            System.out.println(s);
            if (s == " " || s.isEmpty()) {
                continue;
            }
            list.add(s);
        }
    }

    public List<String> getList() {
        return list;
    }

    @Override
    public int check() {
        return Integer.compare(list.size(), len);
    }
}
