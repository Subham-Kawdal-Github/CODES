package Array;

public class SubtractTwoArray {
    public static void main(String[] args) {
        int arr1[] = { 5, 1, 3, 4 };
        int arr2[] = { 4, 2, 4, 5 };
        int sol[] = new int[arr1.length];
        int carry = 0;
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (arr1[i] + carry <= arr2[i]) {
                sol[i] = (arr1[i] + 10 + carry - arr2[i]) % 10;
                carry = -1;
            } else {
                sol[i] = arr1[i] - arr2[i];
                carry = 0;
            }
        }
        for (int e : sol) {
            System.out.println(e);
        }

    }
}
