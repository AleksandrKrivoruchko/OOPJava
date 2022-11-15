package methodsWithArrays;

public class Task2 {
    public int[] differenceOfElements(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len;
        if (len1 == len2) {
            len = len1;
        } else {
            len = len1 > len2 ? len2 : len1;
        }
        int[] res = new int[len];
        for(int i = 0; i < len; i++) {
            res[i] = arr1[i] - arr2[i];
        }
        return res;
    }
}
