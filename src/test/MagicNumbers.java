package test;

public class MagicNumbers {

/*    In mathematics, if the sum of its digits recursively is calculated till a single digit. If the single digit is
1 then the number is called a magic number. It is quite similar to the happy number.
For example, 325 is a magic number because the sum of its digits (3+2+5) is 10, and again sum up the resultant (1+0),
we get a single digit (1) as the result. Hence, the number 325 is a magic number.*/

    private static void printMagicNumber(int[] arr) {
        for (int j : arr) {
            int n = j;
            int rem;
            while (n > 9) {
                int res = 0;
                while (n > 0) {
                    rem = n % 10;
                    res = res + rem;
                    n = n / 10;
                }
                n = res;
            }
            if (n == 1) {
                System.out.println("The number : " + j + " is a magic number");
            } else {
                System.out.println(j + " : is Not a magic number");
            }
        }
    }


    private static boolean printMagicNumberRecursive(int n) {
        if (n == 1) {
            return true;
        }
        int rem;
        int res = 0;
        while (n > 0) {
            rem = n % 10;
            res = res + rem;
            n = n / 10;
        }
        n = res;
        if (n < 9 && n != 1) return false;
        return printMagicNumberRecursive(n);
    }

    public static void main(String[] args) {
//        printMagicNumber(new int[]{ 325, 326, 1234, 226, 10, 1, 2, 37, 46, 55, 73});
        System.out.println(printMagicNumberRecursive(325));
    }
}
