package Array;

public class arrayrev_approaches {

    static void approach2() {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        approach2();
    }
}
