package test.practice.twentytwo;

import java.util.HashMap;
import java.util.Map;

public class TwoSumEasy {

    // Brute force, not recommended.
    public int[] twoSumNSqr(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // Map Approach, better approach.
    public int[] twoSumMap(int[] nums, int target) {

        int[] res = new int[2];

        Map<Integer, Integer> tMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (tMap.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = tMap.get(target - nums[i]);
            }
            tMap.put(nums[i], i);
        }
        return res;
    }
}
