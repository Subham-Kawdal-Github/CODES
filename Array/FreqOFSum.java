package Array;

import java.util.HashMap;

public class FreqOFSum {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 5, 3, 3, 1 };
        int k = 3;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        // int sumArr[] = new int[arr.length - 2];
        // sumArr[0] = sum;
        int count = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, count);
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (map.get(sum) == null) {
                map.put(sum, count);
            } else {
                map.replace(sum, map.get(sum) + 1);
            }
        }
        map.forEach((key, value) -> System.out.println(key + ":" + value));

    }
}
