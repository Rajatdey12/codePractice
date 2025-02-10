package test.practice.twentytwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervalsLeet56 {

    /*Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
     and return an array of the non-overlapping intervals that cover all the intervals in the input.

     Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
     Output: [[1,6],[8,10],[15,18]]
     Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
     */

    public static int[][] mergeIntervals(int[][] intervals) {

        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] curr = null;
        for (int[] in : intervals) {
            if (curr == null) {
                curr = in;
                continue;
            } else if (curr[1] >= in[0]) {
                curr[1] = Math.max(in[1], curr[1]);
            } else {
                list.add(Arrays.copyOf(curr, curr.length));
                curr = in;
            }
        }
        list.add(curr);


        final int[][] ans = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        System.out.println(Arrays.deepToString(ans));
        return ans;
    }

    private static int[][] mergeIntervalsGPT(int[][] intrvls) {

        if (intrvls.length == 0) return new int[0][0];
        Arrays.sort(intrvls, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        int[] curr = intrvls[0];
        merged.add(curr);
        for (int[] intrvl : intrvls) {
            if (intrvl[0] <= curr[1]) {
                curr[1] = Math.max(intrvl[1], curr[1]);
            } else {
                curr = intrvl;
                merged.add(curr);
            }
        }
        final int[][] ans = new int[merged.size()][];
        for (int i = 0; i < merged.size(); i++) {
            ans[i] = merged.get(i);
        }
        System.out.println(Arrays.deepToString(ans));
        return ans;
    }

    public static void main(String[] args) {

        int[][] inp0 = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] inp1 = new int[][]{{1, 4}, {0, 2}, {3, 5}};
        int[][] inp = new int[][]{{1, 4}, {4, 5}};
        int[][] inpx = new int[][]{{1, 4}, {5, 6}};
        int[][] inpy = new int[][]{{1, 10}, {5, 6}};

//        mergeIntervals(inp0);
        mergeIntervalsGPT(inp0);
    }

}
