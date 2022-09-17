import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaxAfterJoin {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = { 5, 3, 3, 3, 4 };

        Arrays.sort(arr);
        // 3 3 3 4 5
        list.add(arr[0]);

        int l = 0;
        for (int i = 1; i < arr.length; i++) {

            // System.out.println(list.get(l));
            if (list.get(l) == arr[i]) {
                list.set(l, list.get(l) + 1);
                // System.out.println(list.get(l));
            } else {
                l++;
                if (arr[i] < list.get(l - 1)) {
                    int temp = list.get(l - 1);
                    list.set(l - 1, arr[i]);
                    list.add(temp);
                } else {
                    list.add(arr[i]);
                }
            }
        }

        for (Integer t : list) {
            System.out.print(t + " ");
        }
        System.out.println();
        int len = list.size();
        System.out.println(list.get(len - 1));

    }
}