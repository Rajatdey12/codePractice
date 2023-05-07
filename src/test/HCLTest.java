package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class HCLTest {

    public static void noOfOccur(String str) {

        char[] aArray = str.toCharArray();

        Map<Character, Integer> occurMap = new HashMap<>();

        for (char ch : aArray) {

            if (occurMap.get(ch) == null) {
                occurMap.put(ch, 1);
            } else {
                occurMap.put(ch, occurMap.get(ch)+1);
            }

        }

        for (Map.Entry<Character, Integer> m : occurMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }


    /*
        No. of permutation of arrangement of the characters in the given string.
     */
    public static void arrangeCombinations(String str, String res) {

        if (str.length() == 0) {
            System.out.println(res + " ");
            return;
        } else {
            for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String subs = str.substring(0, i) +
                    str.substring(i+1);

                    arrangeCombinations(subs, res + ch);
            }
        }
    }

    public static void missingElem(int[] arr) {

        int n = arr.length;
        int missing = ((n + 1) * (n + 2)) / 2;

        for (int i =0; i < n; i++) {
            missing -= arr[i];
        }
        System.out.println(missing);
    }

    public static void duplicateCharacter(String str) {

        Set<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (charSet.contains(c)) {
                System.out.println("Duplicate char " + c);
            } else {
                charSet.add(c);
            }
        }
    }

    public static void printNonRepeatNum(int[] arr) {

        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i : arr) {
            if (intMap.get(i) == null) {
                intMap.put(i, 1);
            } else {
                intMap.put(i, intMap.get(i)+1);
            }
        }

        for (Map.Entry<Integer, Integer> m : intMap.entrySet()) {
            if (m.getValue() == 1) {
                System.out.println(m);
            }
        }
    }

    public static void main(String[] args) {
//        noOfOccur("abc");
        arrangeCombinations("abc", "");
        missingElem(new int[]{2,1,4,5,6});
        duplicateCharacter("Rajat");
        printNonRepeatNum(new int[]{1,2,2,3,3,1,4,3});
    }
}
