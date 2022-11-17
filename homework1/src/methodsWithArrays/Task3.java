package methodsWithArrays;

public class Task3 {
    public void run() {
        int min = -10;
        int max = 10;
        int lenArr1 = 10;
        int lenArr2 = 9;
        ArraysDivisionElenets ade = new ArraysDivisionElenets();
        NewArray newArray = new NewArray();
        int[] arr1 = newArray.createArray(lenArr1, min, max);
        System.out.println("Array1:\n" + newArray.arrayToString(arr1));
        int[] arr2 = newArray.createArray(lenArr2, min, max);
        System.out.println("Array2:\n" + newArray.arrayToString(arr2));
        try {
            int[] arr = ade.div(arr1, arr2);
            System.out.println("Result array:"
                    + newArray.arrayToString(arr) + "\n");
        } catch (RuntimeException e) {
            System.err.println(e.getMessage() + "\n");
        }
    }
}
