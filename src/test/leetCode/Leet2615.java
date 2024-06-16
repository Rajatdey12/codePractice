package test.leetCode;

import java.util.Arrays;

/*You are given a 0-indexed integer array nums. There exists an array arr of length nums.length, where arr[i] is the sum of |i - j| over all j such that nums[j] == nums[i] and j != i. If there is no such j, set arr[i] to be 0.

Return the array arr.



Example 1:

Input: nums = [1,3,1,1,2]
Output: [5,0,3,4,0]
Explanation:
        When i = 0, nums[0] == nums[2] and nums[0] == nums[3]. Therefore, arr[0] = |0 - 2| + |0 - 3| = 5.
        When i = 1, arr[1] = 0 because there is no other index with value 3.
        When i = 2, nums[2] == nums[0] and nums[2] == nums[3]. Therefore, arr[2] = |2 - 0| + |2 - 3| = 3.
        When i = 3, nums[3] == nums[0] and nums[3] == nums[2]. Therefore, arr[3] = |3 - 0| + |3 - 2| = 4.
        When i = 4, arr[4] = 0 because there is no other index with value 2.

Example 2:

Input: nums = [0,5,3]
Output: [0,0,0]
Explanation: Since each element in nums is distinct, arr[i] = 0 for all i.*/
public class Leet2615 {

    public static long[] distance(int[] nums) {
        int i = 0;
        int n = nums.length;
        long[] resArr = new long[n];
        while (i < n) {
            int j = 0;
            while (j < n) {
                if (nums[i] == nums[j]) {
                    resArr[i] += Math.abs(j - i);
                }
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(resArr));
        return resArr;
    }


    public static long[] distanceApproach2(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        long[] resArr = new long[n];
        while (i < n) {
                if (nums[i] == nums[j]) {
                    resArr[i] += Math.abs(j - i);
                }
                j++;
                if (j == n) {
                    i++;
                    j = 0;
                }
        }
        System.out.println(Arrays.toString(resArr));
        return resArr;
    }

    public static void main(String[] args) {
//        distance(new int[] {1,3,1,1,2});
//        distance(new int[] {2,0,2,2,6,5,2});
        distanceApproach2(new int[] {2,0,2,2,6,5,2});
    }
}
