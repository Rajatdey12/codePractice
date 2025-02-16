package test.practice.twentytwo;

import java.util.*;

public class GroupAnagrams {


    public static boolean checkAnagrams(String s1, String s2) {

        if (s1 == null || s2 == null) return false;

        char[] chrArr1 = s1.toCharArray();
        char[] chrArr2 = s2.toCharArray();

        Arrays.sort(chrArr1);
        Arrays.sort(chrArr2);

        return Arrays.equals(chrArr1, chrArr2);

    }

    /*
        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> grpMap = new HashMap<>();

        for (String s : strs) {
            char[] chrArr = s.toCharArray();
            Arrays.sort(chrArr);

            String key = new String(chrArr);

            List<String> valLst = grpMap.getOrDefault(key, new ArrayList<>());
            valLst.add(s);
            grpMap.put(key, valLst);
        }

        List<List<String>> resList = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : grpMap.entrySet()) {
            resList.add(entry.getValue());
        }
        System.out.println(resList);
        return resList;
    }

    public static void main(String[] args) {
        String[] strArr = new String[] {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strArr);
        System.out.println(checkAnagrams("race", "care"));
    }
}
