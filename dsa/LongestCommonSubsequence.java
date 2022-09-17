import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class LongestCommonSubsequence {

    static int countConsSubstring(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 1;
        int max = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] + 1 == arr[i]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 10, 20, 2 };
        int n = arr.length;
        int x = countConsSubstring(arr, n);
        System.out.println(x);
    }
}
