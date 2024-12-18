package test.leetCode;

import java.util.Arrays;

/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed.
All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one.
Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two
adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

Example 1:

Input: nums = [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
Example 2:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 3:

Input: nums = [1,2,3]
Output: 3
 */
public class Leet213 {

    // we are using this variable for memoisation.
    static int[] memo;

    public static void main(String[] args) {
        int[][] testInputs = new int[][] {
                {2,3,2},
                {1,2,3,1},
                {1,2,3}
        };
        rob(testInputs[0]);
        rob(testInputs[1]);
        rob(testInputs[2]);
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return nums[0];
        }
        // skip first and last house
        int[] skipLastHouse = new int[n - 1];
        int[] skipFirstHouse = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            skipLastHouse[i] = nums[i];
            skipFirstHouse[i] = nums[i + 1];
        }

        // get the loot from both the possibilities
        // the below approach uses DP.
//        int lootSkippingLast = robHelperDP(skipLastHouse);
//        int lootSkippingFirst = robHelperDP(skipFirstHouse);

        // this approach use memoisation.
        int lootSkippingLast = robHelperMemo(skipLastHouse);
        int lootSkippingFirst = robHelperMemo(skipFirstHouse);

        int res = Math.max(lootSkippingFirst, lootSkippingLast);
        System.out.println(res);
        return res;
    }

    private static int robHelperDP(int[] nums) {
        int n = nums.length;
        return robHelperDP(nums, n - 1);
    }

    private static int robHelperDP(int[] nums, int j) {
        if (j < 0) {
            return 0;
        }
        return Math.max(robHelperDP(nums, j - 2) + nums[j], robHelperDP(nums, j - 1));
    }

    private static int robHelperMemo(int[] nums) {
        int n = nums.length;
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return robHelperMemo(nums, n - 1);
    }

    private static int robHelperMemo(int[] nums, int j) {
        if (j < 0) {
            return 0;
        }
        if (memo[j] >= 0) {
            return memo[j];
        }
        int res = Math.max(robHelperMemo(nums, j - 2) + nums[j], robHelperMemo(nums, j - 1));
        memo[j] = res;
        return res;
    }
}
