package metodsWithExceptions;

public class Method2 {
    public int sumArray(int[] arr) {
        int len = arr.length + 1;
        int sum = 0;
        for(int i= 0; i<len;i++) {
            sum += arr[i];
        }
        return sum;
    }
}
