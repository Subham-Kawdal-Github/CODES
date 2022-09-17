
public class Power {

    static int pow(int num, int p) {
        // Termination case
        if (p == 0) {
            return 1;
        }
        // Small Problem
        int smallResult = pow(num, p - 1);
        // Post Processing Logic
        return smallResult * num;
    }

    public static void main(String[] args) {
        int result = pow(2, 5);
        System.out.println(result);
    }
}
