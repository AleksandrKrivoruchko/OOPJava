package dataVerification;

public class CheckDate {
    public static boolean isDate(String str) {
        int maxLen = 10;
        int minLen = 8;
        int lenDate = 3;
        if (str.length() < minLen || str.length() > maxLen) {
            return false;
        }
        String[] date = str.split("\\.");
        if(date.length != lenDate) {
            return false;
        }
        for (String item: date) {
            if(!CheckDigits.isDigits(item)) {
                return false;
            }
        }
        return true;
    }
}
