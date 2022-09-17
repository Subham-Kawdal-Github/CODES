package Array;

public class ZigZag {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 7, 8, 6, 2, 1 };

        for (int i = 0; i < arr.length - 2; i++) {
            if ((i % 2 == 0 && arr[i] > arr[i + 1]) || (i % 2 != 0 && arr[i] < arr[i + 1])) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
