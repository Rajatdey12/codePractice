package test.leetCode;

import java.util.HashMap;
import java.util.Map;

/*
Majority Element
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class Leet169 {

    public static int majorityElement(int[] nums) {

        int n = nums.length;
        Map<Integer, Integer> majorMap = new HashMap<>(1);

        for (int i = 0; i < n; i++) {
            majorMap.put(nums[i], majorMap.getOrDefault(nums[i], 0) + 1);
        }
        n = n / 2;

        for (Map.Entry<Integer, Integer> entry : majorMap.entrySet()) {
            if (entry.getValue() > n) {
                System.out.println("Major element is : " + entry.getKey() + " for times " + entry.getValue());
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        majorityElement(new int[] {2,2,1,1,1,2,2});
    }
}
