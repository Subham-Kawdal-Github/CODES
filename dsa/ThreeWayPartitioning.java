public class ThreeWayPartitioning {

    public static void main(String[] args) {
        int arr[] = { 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32 };
        int n = arr.length;
        int lowVal = 14;
        int highVal = 20;
        int start = 0;
        int end = n - 1;

        for (int i = 0; i <= end;) {
            if (arr[i] < lowVal) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
                i++;
            } else if (arr[i] > highVal) {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            } else {
                i++;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
