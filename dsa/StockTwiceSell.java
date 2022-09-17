public class StockTwiceSell {

    static int maxProfit(int arr[], int n) {

        int ma = arr[n - 1];
        int[] dp = new int[n];
        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            ma = Math.max(arr[i], ma);
            dp[i] = Math.max(dp[i + 1], ma - arr[i]);
        }
        int mi = arr[0];
        for (int i = 1; i < n; i++) {
            mi = Math.min(arr[i], mi);
            dp[i] = Math.max(dp[i - 1], dp[i] + (arr[i] - mi));

        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 0, 1, 4 };
        int n = arr.length;
        System.out.println(maxProfit(arr, n));
    }
}
