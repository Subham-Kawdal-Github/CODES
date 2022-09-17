public class CountNoOfZeros {

    static int count = 0;

    static int countNoOfZeros(int n) {
        if (n == 0) {
            return count;
        }
        int t = n % 10;
        if (t == 0) {
            count += 1;
        }
        n = n / 10;
        countNoOfZeros(n);

        return count;
    }

    public static void main(String[] args) {
        int n = 1209803;
        int result = countNoOfZeros(n);
        System.out.println(result);
    }
}
