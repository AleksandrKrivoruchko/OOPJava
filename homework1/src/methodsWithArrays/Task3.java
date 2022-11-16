package methodsWithArrays;

public class Task3 {
    public void run() {
        ArraysDivisionElenets ade = new ArraysDivisionElenets();
        NewArray newArray = new NewArray();
        int[] arr1 = newArray.createArray(10, -10, 10);
        System.out.println(newArray.arrayToString(arr1));
        int[] arr2 = newArray.createArray(1, -10, 10);
        System.out.println(newArray.arrayToString(arr2));
        try {
            int[] arr = ade.div(arr1, arr2);
            System.out.println(newArray.arrayToString(arr));
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}
