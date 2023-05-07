package test.practice.twentytwo;

import java.util.HashMap;
import java.util.Map;

public class Solution {

        public static int singleNonDuplicate(int[] nums) {

            Map<Integer, Integer> intger = new HashMap();
            for (int i=0; i< nums.length; i++) {
                if (intger.get(nums[i]) != null) {
                    intger.put(nums[i], intger.get(nums[i]) + 1);
                } else {
                    intger.put(nums[i], 1);
                }
            }
            for (Map.Entry<Integer,Integer> entry : intger.entrySet()) {
                if (entry.getValue() == 1) return entry.getKey();
            }
            return 0;
        }

        public static int singleNonDupsXOR(int[] inpAr) {

            int res = inpAr[0];

            for (int i = 1; i < inpAr.length; i++) {
                res = res ^ inpAr[i];
            }
            return res;
        }

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[] { 1,1,2,3,3,4,4,8,8 }));
        System.out.println(singleNonDupsXOR(new int[] { 1,1,2,3,3,4,4,8,8 }));
    }
}
