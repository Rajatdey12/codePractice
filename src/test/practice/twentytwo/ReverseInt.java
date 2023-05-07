package test.practice.twentytwo;

public class ReverseInt {

    public static int reverse(int x) {
        System.out.println("Given -> " + x);
        long finalNum = 0;
        while (x != 0) {
            finalNum += x % 10;
            finalNum = finalNum * 10;
            x = x / 10;
        }
        finalNum = finalNum / 10;

        if (finalNum > Integer.MAX_VALUE || finalNum < Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            return -1 * (int) finalNum;
        }
        System.out.println("Reversed -> " + finalNum);
        return (int) finalNum;
    }

    public static int reverseInStringSol(int x) {

        System.out.println("Given -> " + x);
        String str = Integer.toString(x);
        String newStr = "";
        char chr;
        if (str.charAt(0) == '-') {
            for (int i=1; i<str.length(); i++) {
                chr = str.charAt(i);
                newStr = chr + newStr;
            }
            if (Long.parseLong(newStr) < Integer.MAX_VALUE) {
                System.out.println("Reversed -> " + (-1 * Integer.parseInt(newStr)));
                return -1 * Integer.parseInt(newStr);
            }
        } else {
            for (int i=0; i<str.length(); i++) {
                chr = str.charAt(i);
                newStr = chr + newStr;
            }
            if (Long.parseLong(newStr) < Integer.MAX_VALUE) {
                System.out.println("Reversed -> " + Integer.parseInt(newStr));
                return Integer.parseInt(newStr);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        reverse(-132);
        reverseInStringSol(-132);
    }
}
