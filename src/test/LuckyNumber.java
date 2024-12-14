package test;

public class LuckyNumber {

   /* The sequence of natural numbers or subset of integers that we get after removing second, third, fourth, fifth,
    and so on number respectively from the sequence.
    By applying the process there still remains some numbers indefinitely in the sequence such numbers are known as lucky numbers.
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19

Let's remove every second number (2, 4, 6, 8, 10, ……) from the above sequence, we get:

1, 3, 5, 7, 9, 11, 13, 15, 17, 19

Let's remove every third number (5, 11, 17, 23, ……) from the above sequence, we get:

1, 3, 7, 9, 13, 15, 19, 21, 25, …….*/

    public static int counter = 2;

    private static boolean isLuckyNumber(int n) {
//        int counter = 2;
        if (counter > n) return true;
        if (n % counter == 0) return false;
        n = n - (n / counter); // new set of natural numbers.
        counter++;
        return isLuckyNumber(n);
    }

    public static void main(String[] args) {
        System.out.println(isLuckyNumber(19));
    }
}
