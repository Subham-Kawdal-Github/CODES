package Array;

public class NOSmallerThanCurrent {
    public static void main(String[] args) {
        int nums[] = { 5, 4, 7, 3, 7, 2 };
        int bucket[] = new int[102];
        // Get Frequency of each element
        for (int e : nums) {
            bucket[e]++;
        }
        // count smaller number than each element3
        for (int i = 1; i < bucket.length; i++) {
            bucket[i] = bucket[i] + bucket[i - 1];
        }
        // populate result
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = bucket[nums[i] - 1];
            }
        }

        for (int e : result) {
            System.out.print(e + " ");
        }

    }
}
