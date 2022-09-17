package Array;

import java.util.HashMap;

public class TwoSumUsingHashmap {
    public static void main(String[] args) {
        int arr[] = { 2, 9, 6, 3, 1, 10, 4 };
        int sum = 9;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int key = sum - arr[i];
            if (map.get(arr[i]) == null) {
                map.put(key, i);
            } else {
                System.out.println("Indexes giving the sum : " + map.get(arr[i]) + " and " + i);
            }
        }

    }
}
