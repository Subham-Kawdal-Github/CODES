package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int len = arr.length;
        int dup[] = new int[len];

        for (int i = 0; i < arr.length; i++, len--) {
            dup[len - 1] = arr[i];
        }
        System.out.println("After Reversing :");
        for (int e : dup) {
            System.out.println(e);
        }
    }
}
