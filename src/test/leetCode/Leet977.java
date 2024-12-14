package test.leetCode;

import java.util.Arrays;

/* 977. Squares of a Sorted Array */
public class Leet977 {

    /*
    given - [-4, -3, -1, 0, 2, 5, 6]
    output - [0, 1, 4, 9, 16, 25, 36]
     */

    private static int[] sortedSquares(int[] inpArr) {
        int n = inpArr.length;
        int start = 0, end = n - 1;
        int[] opArr = new int[n];
        while (start <= end) {
            if (Math.abs(inpArr[start]) > Math.abs(inpArr[end])) {
                opArr[n - 1] = inpArr[start] * inpArr[start];
                start++;
            } else {
                opArr[n - 1] = inpArr[end] * inpArr[end];
                end--;
            }
            n--;
        }
        return opArr;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {-4, -3, -1, 0, 2, 5, 6};
        System.out.println(Arrays.toString(sortedSquares(arr1)));
    }
}
