package test.practice.twentytwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VizaTest {

    // Find the point where maximum intervals overlap

    /*  Input: entry[] = {1, 2, 9, 5, 5}
              exit[] = {4, 5, 12, 9, 12}
        First guest in array arrives at 1 and leaves at 4,
        second guest arrives at 2 and leaves at 5, and so on.
        Output: 5
        There are maximum 3 guests at time 5.  */

    public static int maximumOverlapTime(int[] enterArr, int[] exitArr) {

        int max_guest = 1;
        int guest_cnt = 1;
        int time = enterArr[0];
        int i = 1;
        int j = 0;

        while (i < enterArr.length && j < enterArr.length) {

            if (enterArr[i] <= exitArr[j]) {
                guest_cnt++;
                if (guest_cnt > max_guest) {
                    max_guest = guest_cnt;
                }
                time = enterArr[i];
                i++;

            } else {
                guest_cnt--;
                j++;
            }
        }
        System.out.println(time);
        return time;
    }

    //  Largest Sum Contiguous Subarray (Kadane’s Algorithm)

    /* Given an array arr[] of size N. The task is to find the sum of the
        contiguous subarray within a arr[] with the largest sum.
     */

    public static int contiguousSubArr(int[] arr) {

        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int i = 0;
        int n = arr.length;

        while (i < n) {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            i++;
        }
        System.out.println(max_so_far);
        return max_so_far;
    }


    /* Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        Output: [[1,6],[8,10],[15,18]]
        Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6]. */

    public static int[][] mergeIntervals(int[][] intervals) {

        int j = 0;
        int n = intervals.length;
        List<List<Integer>> outerList = new ArrayList<>();

        if (intervals == null || intervals.length == 1) return intervals;

        for (int i = j + 1; i < n; i++) {
            if (intervals[i][0] <= intervals[j][1]) {
                List<Integer> innerList = Arrays.asList(intervals[j][0], intervals[i][1]);
                outerList.add(innerList);
            }
            else{
                outerList.add(Arrays.asList(intervals[j][0], intervals[j][1]));
                outerList.add(Arrays.asList(intervals[n-1][0], intervals[n-1][1]));
            }
            j = j + 2;
            i++;
        }
        outerList.stream().forEach(el -> {
            System.out.println(el);
        });
        int[][] resArr = outerList.stream()
                .map(l -> l. stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        return resArr;
    }

    public static void main(String[] args) {

        int enter[] = {1, 2, 10, 5, 5};
        int exit[] = {4, 5, 12, 9, 12};
        maximumOverlapTime(enter, exit);

        int contigousArr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        contiguousSubArr(contigousArr);

//        int[][] setArr = new int[][] {{1,3},{2,6},{8,10},{15,18}};
        int[][] setArr = new int[][] {{1,4},{4,5}};
        mergeIntervals(setArr);
    }
}
