package methodsWithArrays;

public class Task2 {
    public void run() {
        int min = -10;
        int max = 10;
        int lenArr1 = 10;
        int lenArr2 = 9;
        ArraysDifference ad = new ArraysDifference();
        NewArray nArray = new NewArray();
        int[] arr1 = nArray.createArray(lenArr1, min, max);
        System.out.println("Array1:\n" + nArray.arrayToString(arr1));
        int[] arr2 = nArray.createArray(lenArr2, min, max);
        System.out.println("Array2:\n" + nArray.arrayToString(arr2));
        int[] arr = null;
        try {
            arr = ad.differenceOfElements(arr1, arr2);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage() + "\n");
        }
        if (arr != null) {
            System.out.println("Result array:\n"
                    + nArray.arrayToString(arr) + "\n");
        }
    }
}
