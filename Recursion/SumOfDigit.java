package recursion;

public class SumOfDigit {

    static int sumOfDigitFn(int num, int sum) {
        // Termination Case
        if (num == 0) {
            return sum;
        }
        // Pre Processing logic
        int r = num % 10;
        sum += r;
        // small problem
        num = num / 10;
        return sumOfDigitFn(num, sum); // Recursive call
    }

    public static void main(String[] args) {
        int num = 123;
        int result = sumOfDigitFn(num, 0);
        System.out.println(result);

    }
}
