package test.basics.pack1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IBMTest {

    /** Given a list of integers, find out all the numbers starting with 1 using Stream functions? **/
    private void testPrintNoStartWithGiven(int n, List<Integer> intList) {
        List<Integer> resList = intList.stream()
                .filter(e -> e / 10 == n || e == n)
                .collect(Collectors.toList());
        System.out.println(resList);
    }

    private void testPrintNoStartWithGivenStrMtd(String n, List<Integer> intList) {
        List<Integer> resList = intList.stream().filter(e -> String.valueOf(e).startsWith(n))
                .collect(Collectors.toList());
        System.out.println(resList);
    }

    /** Given a String, find the first non-repeated character in it using Stream functions? **/
    private void testGetNonRepeatChar(String s) {

        char ch = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(ch);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 12, 13, 4, 5, 6, 16, 42);
        IBMTest ibmTest = new IBMTest();
        ibmTest.testPrintNoStartWithGiven(4, intList);
        ibmTest.testPrintNoStartWithGivenStrMtd("4", intList);
        ibmTest.testPrintNoStartWithGiven(1, intList);
        ibmTest.testPrintNoStartWithGivenStrMtd("1", intList);
        ibmTest.testGetNonRepeatChar("waasscsd");
    }
}
