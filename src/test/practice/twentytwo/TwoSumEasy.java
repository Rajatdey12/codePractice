package test.practice.twentytwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumEasy {

    /* return the int array of indices of the two complements
    whose sum is equal to the input target. */

    public static void main(String[] args) {
        twoSumMap(new int[] {1,2,3,4}, 5);
        twoSumsMap2(new int[] {1,2,3,4}, 5);
    }

    // Brute force, not recommended.
    public static int[] twoSumNSqr(int[] nums, int target) {

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
    public static int[] twoSumMap(int[] nums, int target) {

        int[] res = new int[2];

        Map<Integer, Integer> tMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (tMap.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = tMap.get(target - nums[i]);
            }
            tMap.put(nums[i], i);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }


    public static int[] twoSumsMap2(int[] arr, int trgt) {

        Map<Integer, Integer> intMp = new HashMap<>();
        int arLen = arr.length;
        int[] resAr = new int[2];
        intMp.put(arr[0], 0);

        for (int i=1; i < arLen; i++) {

            int diff = trgt - arr[i];

            if (intMp.containsKey(diff)) {

                resAr[0] = intMp.get(diff);
                resAr[1] = i;
            } else {
                intMp.put(arr[i], i);
            }
        }
        System.out.println(Arrays.toString(resAr));
        return resAr;
    }
}
