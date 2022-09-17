import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StockMaxProfIII {

    // static int maxProfit(int[] prices) {

    // int start = Integer.MAX_VALUE;
    // int ans = 0;
    // List<Integer> arr = new ArrayList<>();

    // for (int i = 0; i < prices.length - 1; i++) {
    // if (prices[i] < start) {
    // start = prices[i];
    // } else if (prices[i + 1] < prices[i]) {
    // arr.add(prices[i] - start);
    // // System.out.println(prices[i] - start);
    // start = prices[i + 1];
    // i++;

    // }

    // if (i == prices.length - 2 && prices[i + 1] > start) {
    // arr.add(prices[i + 1] - start);
    // System.out.println(prices[i + 1] - start + " ---");
    // }

    // }

    // Collections.sort(arr, Collections.reverseOrder());
    // if (arr.size() == 0) {
    // return 0;
    // } else if (arr.size() == 1) {
    // ans = arr.get(0);
    // } else {
    // ans = arr.get(0) + arr.get(1);
    // }

    // return ans;
    // }

    static int maxProfit(int[] prices) {
        int n = prices.length;
        int[] leftMaxProfit = new int[n], rightMaxProfit = new int[n];
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            leftMaxProfit[i] = Math.max(leftMaxProfit[i - 1], prices[i] - minPrice);
        }
        System.out.println();
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            rightMaxProfit[i] = Math.max(rightMaxProfit[i + 1], maxPrice - prices[i]);
        }
        System.out.println();
        int profit = 0;
        for (int i = 0; i < n; i++) {
            profit = Math.max(profit, rightMaxProfit[i] + leftMaxProfit[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 3, 3, 5, 0, 0, 3, 1, 4 };
        System.out.println(maxProfit(prices));
    }
}
