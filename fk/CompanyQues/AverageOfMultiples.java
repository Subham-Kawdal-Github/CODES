public class AverageOfMultiples {
    public static void main(String[] args) {
        int n = 100;
        int p = 10;
        int sum = 0;

        for (int i = 1; i <= p; i++) {
            sum = sum + n * i;
        }

        int average = sum / p;
        System.out.println(average);

    }
}
