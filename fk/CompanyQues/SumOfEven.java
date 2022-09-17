public class SumOfEven {
    public static void main(String[] args) {
        int n = 10;
        int ans = 0;
        for (int i = 2; i <= n;) {
            ans = ans + i;
            i = i + 2;
        }
        System.out.println(ans);
    }
}
