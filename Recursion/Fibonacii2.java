public class Fibonacii2 {

    static void printFibo(int count, int a, int b) {
        if (count == 0) {
            return;
        }
        System.out.println(a);
        count--;
        printFibo(count, b, a + b);

    }

    public static void main(String[] args) {
        // System.out.println(0);
        // System.out.println(1);
        printFibo(8, 0, 1);
    }
}
