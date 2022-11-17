package methodsWithArrays;

import java.util.Random;

public class NewArray {
    public int[] createArray(int len, int min, int max) {
        int[] arr = new int[len];
        Random rnd = new Random();
        for (int i = 0; i < len; i++) {
            arr[i] = rnd.nextInt(min, max);
        }
        return arr;
    }

    public String arrayToString(int[] arr) {
        if (arr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (int a : arr) {
            sb.append(a).append(" ");
        }
        return sb.toString();
    }
}
