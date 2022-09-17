import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

    // Approach(Boyer-Moore Voting Algorithm)

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 2 };
        List<Integer> result = new ArrayList<>();
        int candOne = 0, candTwo = 0, cntOne = 1, cntTwo = 1;

        for (int i = 0; i < args.length; i++) {
            if (arr[i] == arr[candOne]) {
                cntOne++;
            } else if (arr[i] == arr[candTwo]) {
                cntTwo++;
            } else {
                cntOne--;
                cntTwo--;
            }
            // System.out.println(arr);

            if (cntOne == 0) {
                candOne++;
                cntOne = 1;
            } else if (cntTwo == 0) {
                candTwo++;
                cntTwo = 1;
            }
        }

        cntOne = 0;
        cntTwo = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candOne) {
                cntOne++;
            } else if (arr[i] == candTwo) {
                cntTwo++;
            }
        }

        if (cntOne > (arr.length / 3)) {
            result.add(arr[candOne]);
        }
        if (cntTwo > (arr.length / 3)) {
            result.add(arr[candTwo]);
        }
        System.out.println(result);
        for (Integer integer : result) {
            System.out.println(integer);
        }

    }
}
