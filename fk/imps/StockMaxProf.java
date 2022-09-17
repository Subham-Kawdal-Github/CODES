public class StockMaxProf {
    static int maxProfit(int[] prices) {

        int least = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < least) {
                least = prices[i];
            } else if (prices[i] - least > ans) {
                ans = prices[i] - least;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}
