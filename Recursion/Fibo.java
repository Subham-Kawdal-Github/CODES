class Fibonaki {
    public static void main(String[] args) {
        int n = 200;
        System.out.println("0, 1" + fibo(n, 0, 1));
    }

    static String fibo(int n, int a, int b) {
        if (a + b > n) {
            return "";
        } else {
            return ", " + String.valueOf(a + b) + fibo(n, b, a + b);
        }
    }

}