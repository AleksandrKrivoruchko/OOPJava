package methodsWithArrays;

public class ArraysDivisionElenets {
    private ArraysDifference ad = new ArraysDifference();

    public int[] div(int[] arr1, int[] arr2) {
        if (!ad.isNotNull(arr1, arr2)) {
            throw new RuntimeException("Методу нельзя передавать null!");
        }
        if (!ad.isLengthEquals(arr1, arr2)) {
            throw new RuntimeException("Массивы разной длинны!");
        }

        int len = arr1.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            if (arr2[i] != 0) {
                res[i] = arr1[i] / arr2[i];
            } else {
                throw new RuntimeException("Деление на ноль!");
            }
        }
        return res;
    }
}
