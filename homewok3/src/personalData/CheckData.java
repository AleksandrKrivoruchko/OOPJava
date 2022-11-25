package personalData;

import java.util.List;

public class CheckData {
    private final int template = 6;
    private final int lengthGender = 1;
    public int checkCountStrings(List<String> ls) {
        return Integer.compare(ls.size(), template);
    }

    public boolean isDigit(String str) {
        for (char ch : str.toCharArray()) {
            if(!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public String findPhone(List<String> ls) {
        for (String s : ls) {
            if(Character.isDigit(s.charAt(0))) {
                if(isDigit(s)) {
                    return s;
                }
            }
        }
        return null;
    }

    public String findGender(List<String> ls) {
        for (String s : ls) {
            if(s.length() == lengthGender) {
                return s;
            }
        }
        return null;
    }


}
