
public class Factorial {
    static int fact(int num) {
        // Termination Case
        if (num == 1) {
            return 1;
        }
        // Small Problem
        int smallResult = fact(num - 1); // fact(5-1), fact(5-2)
        // Processing Logic
        return num * smallResult;
    }

    public static void main(String[] args) {
        int result = fact(5); //
        System.out.println(result);
    }
}
