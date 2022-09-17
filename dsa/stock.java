import java.util.Vector;

/**
 * stock
 */
public class stock {
    static int maxProfit(Vector<Integer> prices) {
        int pof = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < prices.size(); i++) {
            if (prices.elementAt(i) < pof) {
                pof = prices.elementAt(i);
            } else if (prices.elementAt(i) - pof > ans) {
                ans = prices.elementAt(i) - pof;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();

        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(23);
        v1.add(10);
        v1.add(4);

        System.out.println("Vector v1 is " + v1);

        System.out.println(maxProfit(v1));

    }
}