
public class ArrayIsSortedOrNot {

    static boolean isSorted(int arr[], int index) {
        // Termination Case
        if (arr.length - 1 == index) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // Small Problem
        index = index + 1;
        return isSorted(arr, index); // Tail Recursion
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 90, 122 };
        int index = 0;
        System.out.println(isSorted(arr, index) ? "Sorted" : "Not Sorted");
    }
}
