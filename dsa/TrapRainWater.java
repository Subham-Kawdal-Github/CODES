public class TrapRainWater {
    public static void main(String[] args) {
        // https://www.youtube.com/watch?v=UZG3-vZlFM4
        int arr[] = { 3, 1, 2, 4, 0, 1, 3, 2 };
        int n = arr.length;

        int[] left = new int[arr.length];
        left[0] = arr[0];
        int[] right = new int[arr.length];
        right[n - 1] = arr[n - 1];

        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(left[i], right[i]) - arr[i];
        }
        System.out.println(ans);

    }
}
