import java.util.Arrays;
import java.util.Collections;

public class SmalestSubArrGTSum {
    static int smallestSubArrHavingSum(Integer[] arr, int n, int x) {

        Arrays.sort(arr, Collections.reverseOrder());
        int count = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum >= x) {
                return count;
            }
            count++;
        }

        return n;
    }

    public static void main(String[] args) {
        Integer arr[] = { 1, 4, 45, 6, 0, 19 };
        int x = 51;
        int n = arr.length;
        int z = smallestSubArrHavingSum(arr, n, x);
        System.out.println(z);
    }
}