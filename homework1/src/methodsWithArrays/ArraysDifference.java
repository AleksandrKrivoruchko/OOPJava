package methodsWithArrays;

public class ArraysDifference {
    public int[] differenceOfElements(int[] arr1, int[] arr2) {
        if (!isNotNull(arr1, arr2)) {
            throw new RuntimeException("Методу нельзя передавать null!");
        }

        int len = 0;

        if (isLengthEquals(arr1, arr2)) {
            len = arr1.length;
        } else {
            throw new RuntimeException("Массивы разной длинны!");
        }

        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = arr1[i] - arr2[i];
        }
        return res;
    }

    public boolean isNotNull(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return false;
        }
        return true;
    }

    public boolean isLengthEquals(int[] arr1, int[] arr2) {
        return arr1.length == arr2.length;
    }

}
