package Array;

public class DutchFlagProb {

    public static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 2, 0, 1 };
        int low;
        int mid;
        low = mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }

        for (int e : arr) {
            System.out.println(e);
        }

    }
}
