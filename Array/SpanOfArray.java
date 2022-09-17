package Array;

public class SpanOfArray {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 4, 14, 19, 20, 32, 23, 34, 31 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Span : " + (max - min));
    }
}
