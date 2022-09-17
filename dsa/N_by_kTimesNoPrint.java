import java.util.HashMap;
import java.util.Map;

public class N_by_kTimesNoPrint {
    static void NbyK_TimesNo(int[] arr, int n, int k) {
        int t = n / k;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.replace(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // System.out.println("Key = " + entry.getKey() + ", Value = " +
            // entry.getValue());
            if (entry.getValue() > t) {
                System.out.println(entry.getKey());
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 4, 2, 8, 3, 5, 3, 3, 7, 5, 3, 2, 2 };
        int n = arr.length;
        int k = 4;
        NbyK_TimesNo(arr, n, k);
    }
}
