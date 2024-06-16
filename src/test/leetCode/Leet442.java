package test.leetCode;

import java.util.ArrayList;
import java.util.List;

public class Leet442 {

    public static List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int[] cs = new int[n + 1];
        List<Integer> al = new ArrayList<>(1);
        for (int i = 0; i < n; i++) {
            cs[nums[i]] =  cs[nums[i]] + 1;
        }
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == 2) {
                al.add(i);
            }
        }
        System.out.println(al);
        return al;
    }

    public static void main(String[] args) {
        findDuplicates(new int[] {4,3,2,7,8,2,3,1});
    }
}

