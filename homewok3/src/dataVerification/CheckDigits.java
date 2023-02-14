package dataVerification;

public class CheckDigits {
    public static boolean isDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
