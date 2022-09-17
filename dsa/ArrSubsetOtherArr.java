import java.util.Arrays;

public class ArrSubsetOtherArr {

    static boolean arrSubsetOfOther(int arr1[], int arr2[]) {
        int flag = 0;
        for (int i = 0; i < arr2.length; i++) {
            flag = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr2[] = { 11, 3, 7, 1 };
        int arr1[] = { 11, 1, 13, 21, 3, 7 };

        // arrSubsetOfOther(arr1, arr2);
        System.out.println(arrSubsetOfOther(arr1, arr2));
    }
}
