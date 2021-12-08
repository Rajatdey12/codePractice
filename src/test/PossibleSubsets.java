package test;

public class PossibleSubsets {

    public static void possibleSubsets(String str) {
        int len = str.length();
        String[] subArr = new String[len * (len + 1) / 2];
        int temp = 0;

        for (int i = 0; i < len; i++) {
             for (int j = i; j < len; j++) {
                subArr[temp] = str.substring(i, j+1);
                temp++;
             }
        }
        for (String s : subArr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        possibleSubsets("abc");
    }
}
