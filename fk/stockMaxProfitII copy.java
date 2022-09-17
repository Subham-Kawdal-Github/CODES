// rebuy and resell is allowed means morethan 2 times buy and sell allowed

public class stockMaxProfitII {
    public static int maxProfit(int[] prices) {

        int start = prices[0];
        int ans = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < start) {
                start = prices[i];
            } else if (prices[i + 1] < prices[i]) {
                ans = ans + (prices[i] - start);
                start = prices[i + 1];
                i++;
            }
            if (i == prices.length - 2 && prices[i + 1] > start) {
                ans = ans + (prices[i + 1] - start);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }

}
