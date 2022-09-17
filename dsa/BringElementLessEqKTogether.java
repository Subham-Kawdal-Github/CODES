public class BringElementLessEqKTogether {
    public static void main(String[] args) {
        int[] ar = { 2, 1, 5, 6, 3 };
        int n = ar.length;
        int k = 3;

        int count = 0;
        int slider = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] > k) {
                slider++;
            } else if (slider > 0) {
                int temp = ar[i];
                ar[i] = ar[i - slider];
                ar[i - slider] = temp;
                count++;
            }
        }
        System.out.println(count);

    }
}