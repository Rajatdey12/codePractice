package test.practice.twentytwo;

import java.util.*;

public class VolksWagenTest {
    /**
     *
     * @param arr the given array
     * @return numbers which are repeating by N times
     */
    public static List<Integer> repeatingNums(int[] arr) {
        long currMil = System.currentTimeMillis();
        System.out.println(currMil/1000.0);
        Set<Integer> intSet = new HashSet<>(1);
        List<Integer> resIntLst = new ArrayList<>(1);
        int i = 0;
        Arrays.sort(arr);
        while (i < arr.length) {
            if (intSet.contains(arr[i])) {
                resIntLst.add(arr[i]);
                if (i != arr.length-1) {
                    while (arr[i] == arr[i + 1]) {
                        i++;
                    }
                }
            } else {
                intSet.add(arr[i]);
            }
            i++;
        }
        System.out.println(resIntLst);
        System.out.println("Time taken for repeatingNums() : " + (System.currentTimeMillis() - currMil)/1000.0);
        return resIntLst;
    }


    public static List<Integer> repeatNumsMapSol(int[] nums) {

        Map<Integer, Integer> intMap = new HashMap<>(1);
        List<Integer> storeLst = new ArrayList<>(1);
        for (int i = 0; i < nums.length; i++) {
            if (intMap.containsKey(nums[i]) && !storeLst.contains(nums[i])) {
                intMap.put(nums[i], intMap.get(nums[i]) + 1);
                storeLst.add(nums[i]);
            } else {
                intMap.put(nums[i], 1);
            }
        }
        System.out.println(storeLst);
        return storeLst;
    }


    public static void advancedSol(int[] numRay) {
        long currMil = System.currentTimeMillis();
        System.out.println(currMil/1000.0);
        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] % numRay.length] = numRay[numRay[i] % numRay.length] + numRay.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length * 2) {
                System.out.println(i + " ");
            }
        }
        System.out.println("Time taken for advancedSol() : " + (System.currentTimeMillis() - currMil)/1000.0);
    }

    public static void main(String[] args) {
        repeatingNums(new int[]{1,1,2,2,3,3,3,7,11,7,11,1,12});
//        repeatingNums(new int[]{1,2,2,2,2,3,3,3,7,11,12});
//        repeatingNums(new int[]{1,2,3,4,4});
//        repeatingNums(new int[]{1,2,3,3,3,4,4});
//        repeatingNums(new int[]{1,2,2,3});
//        repeatingNums(new int[]{1,2,3,4,5,6,7});
        advancedSol(new int[]{1,1,2,2,3,3,3,7,11,7,11,1,12});
        repeatNumsMapSol(new int[]{1,1,2,2,3,3,3,7,11,7,11,1,12});
        repeatNumsMapSol(new int[]{1,2,3,4,4});
        repeatNumsMapSol(new int[]{1,2,3,3,3,4,4});
    }
}
