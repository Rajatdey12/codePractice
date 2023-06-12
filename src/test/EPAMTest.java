package test;

import java.util.*;

/**
 * @author rajat dey
 */
public class EPAMTest {

    /**
     * @param s substring s
     * @return count of the minimum occurrences of substring
     */
    public static int smallestOccurSubs(String s) {

        // All possible subset list
        List<String> allSubsLst = new ArrayList<>(1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                allSubsLst.add(s.substring(i, j));
            }
        }

        // Map to store all the count of occurrences
        Map<String, Integer> storeMap = new HashMap<>(1);

        for (String str : allSubsLst) {
            if (storeMap.get(str) != null) {
                storeMap.put(str, storeMap.get(str) + 1);
            } else {
                storeMap.put(str, 1);
            }
        }

        // List to store the unique occurrences.
        List<String> unqLst = new ArrayList<>(1);

        for (Map.Entry<String, Integer> mpEntry : storeMap.entrySet()) {
            if (mpEntry.getValue() == 1) {
                unqLst.add(mpEntry.getKey());
            }
        }

        // Map to store count of characters of unique Strings from unique List.
        Map<String, Integer> uniqCntMap = new HashMap<>(1);

        for (String str : unqLst) {
            uniqCntMap.put(str, str.length());
        }

        System.out.println(uniqCntMap);
        // return the minimum occurring count of the unique element.
        int minVal = Integer.MAX_VALUE;
        for (String keyStr : uniqCntMap.keySet()) {
            minVal = Math.min(minVal, uniqCntMap.get(keyStr));
        }
        return minVal;
    }

    /**
     *
     * @param A
     * @return the count of valid pairs
     */
    public static boolean pairWith(int[] A) {
        // Two pinter solution.

        return false;
    }


    public static void main(String[] args) {
//        System.out.println(smallestOccurSubs("ababaabba"));
        System.out.println(smallestOccurSubs("zyzyzyz"));
        System.out.println(pairWith(new int[]{7,7,7}));
    }

}
