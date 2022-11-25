package personalData;

import java.util.ArrayList;
import java.util.List;

public class CheckData {
    private final int template = 6;
    private final int lengthGender = 1;
    private final int lengthDate = 3;

    List<String> lsPersonData = new ArrayList<>();

    public List<String> getLsPersonData() {
        return lsPersonData;
    }

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

    public String findBirthday(List<String> ls) {
        for (String s : ls) {
            if(Character.isDigit(s.charAt(0)) && isBirthday(s)) {
                return s;
            }
        }
        return null;
    }

    public boolean isBirthday(String str) {
        String[] temp = str.split("\\.");
        if(temp.length < lengthDate) {
            return false;
        }
        for (String s : temp) {
            if(!isDigit(s)) {
                return false;
            }
        }
        return true;
    }

    public void fillLsPersonData(List<String> ls) {
       if (removeElement(ls, findGender(ls))) {
           if(removeElement(ls, findPhone(ls))) {
               removeElement(ls, findBirthday(ls));
           }
       }
       for (String s : ls) {
           lsPersonData.add(s);
       }
       cleanLsPersonData();
    }

    private boolean removeElement(List<String> ls, String str) {
        System.out.println(str);
        if(str == null) {
            return false;
        }
        lsPersonData.add(str);
        ls.remove(str);
        return true;
    }

    public void cleanLsPersonData() {
        for (int i = 0; i < lsPersonData.size(); i++) {
           String s = lsPersonData.get(i);
           if(s == null || s.isEmpty()) {
               lsPersonData.remove(i);
           }
        }
    }
}
