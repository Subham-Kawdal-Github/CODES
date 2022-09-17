import java.util.*;
import java.util.HashMap;
import java.util.Map;

//The first method is using the Hashmapm
//Second method is called  Moore’s Voting Algorithm

// public class MajorityElement {
//     public static void main(String[] args) {
//         int[] arr = { 3, 2, 3 };
//         int n = arr.length;
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {
//             if (map.containsKey(arr[i])) {
//                 map.put(arr[i], map.get(arr[i]) + 1);
//             } else {
//                 map.put(arr[i], 1);
//             }
//         }

//         for (Integer i : map.keySet()) {
//             if (map.get(i) > (n / 2)) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

//  MOORES VOTING ALGORITHM 

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 3, 4, 3, 2, 4, 4, 4, 4 };
        int n = nums.length;
        int maj_index = 0;
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (nums[maj_index] == nums[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == nums[maj_index]) {
                count++;
            }
        }
        if (count > n / 2) {
            System.out.println(nums[maj_index]);
        } else {
            System.out.println("No majority element");
        }
    }
}