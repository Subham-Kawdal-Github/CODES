public class Second {
    // N to 1 Printing
    static void show(int n) {
        // Termination Case
        if (n == 0) {
            return; // exit from the function
        }
        if (n % 2 != 0) {
            System.out.println(n); // Pre Processing Logic / During Stack Building time
        }
        show(n - 1); // Small Problem
        if (n % 2 == 0) {
            System.out.println(n); // Post Processing Logic / During Stack Fall Time
        }
    }

    public static void main(String[] args) {
        show(5);
    }
}
