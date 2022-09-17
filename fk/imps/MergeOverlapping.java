import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlapping {

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
        List<int[]> res = new ArrayList<>();

        if (intervals.length == 0 || intervals == null) {
            System.out.println((res.toArray(new int[0][])));
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        // We created a list with array inside it and fill it using the logic given
        // below
        // 1 3 --- 2 6 --- 8 10 ---- 15 18
        // We are basically comparing the last of first array with first of next array
        // to check overlaping
        for (int[] i : intervals) {
            if (i[0] <= end) {
                end = Math.max(i[1], end);
            } else {
                res.add(new int[] { start, end });
                start = i[0];
                end = i[1];
            }
        }

        res.add(new int[] { start, end });
        int[][] tt = res.toArray(new int[0][]);
        for (int[] is : tt) {
            for (int is2 : is) {
                System.out.print(is2 + " ,");
            }
            System.out.println();
        }
    }
}
