package test.leetCode;

/*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.



        Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.*/

import java.util.Arrays;

// we will use memoisation top down approach
public class Leet198 {

    static int[] memo;

    public static int rob(int[] nums) {
        int n = nums.length;
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return rob(nums, n - 1);
    }

    private static int rob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        if (memo[i] >= 0) {
            return memo[i];
        }
        int res = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
        memo[i] = res;
        System.out.println(res);
        return res;
    }


    // DP approach
    /*
    we will take approach of house robbed and not robber
    and will get the max profit out of it.
    robbed = robDP(nums, j - 2)+ nums[j]
    not robber = robDP(nums, j - 1)
     */
    public static int robDP(int[] nums) {
        int n = nums.length;
        return robDP(nums, n - 1);
    }

    private static int robDP(int[] nums, int j) {
        if (j < 0) {
            return 0;
        }
        int res = Math.max(robDP(nums, j - 2) + nums[j], robDP(nums, j - 1));
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
//        rob(new int[]{1,2,3,1});
//        robDP(new int[]{1,2,3,1});
//        rob(new int[]{2,7,9,3,1});
        robDP(new int[]{2,7,9,3,1});
//        rob(new int[]{20,100,30,150});
//        rob(new int[]{40, 30, 10});
//        rob(new int[]{0,1});
    }
}
