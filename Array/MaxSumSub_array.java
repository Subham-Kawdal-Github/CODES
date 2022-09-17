package Array;

public class MaxSumSub_array {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2, 3, 2, 2, 2, };
        int k = 3;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        int max = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            max = sum > max ? sum : max;
        }

        System.out.println(max);
    }
}
