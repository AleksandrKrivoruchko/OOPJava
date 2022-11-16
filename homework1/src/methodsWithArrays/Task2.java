package methodsWithArrays;

public class Task2 {
    public void run() {
        ArraysDifference ad = new ArraysDifference();
        NewArray nArray = new NewArray();
        int[] arr1 = nArray.createArray(10, -10, 10);
        System.out.println(nArray.arrayToString(arr1));
        int[] arr2 = nArray.createArray(5, -10, 10);
        System.out.println(nArray.arrayToString(arr2));
        int[] arr = null;
        try {
            arr = ad.differenceOfElements(arr1, arr2);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        if (arr != null) {
            System.out.println(nArray.arrayToString(arr));
        }
    }
}
