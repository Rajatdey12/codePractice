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

public class Leet198 {


    public static int rob(int[] nums) {
        int n =  nums.length;
        int idx = 1;
        int profit = 0;
        Arrays.sort(nums);
        while (idx < n) {
            if (nums[idx] > nums[idx-1]) {
                profit += Math.max(profit, nums[idx]);
                idx+=2;
            } else {
                idx++;
            }
        }
        System.out.println(profit);
        return profit;
    }

    public static void main(String[] args) {
//        rob(new int[]{1,2,3,1});
//        rob(new int[]{2,7,9,3,1});
//        rob(new int[]{20,100,30,150});
        rob(new int[]{40,30,10});
//        rob(new int[]{0,1});
    }
}
