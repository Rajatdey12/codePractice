package test.practice.twentytwo;

import java.util.*;

public class KthSmallestElementInSortedMatrix {

    // kth smallest number from a sorted matrix n^2 approach.
    public static int kthSmallest(int[][] matrix, int k) {

        List<Integer> ar = new ArrayList<>();

        for (int i =0; i < matrix.length; ++i) {
            for (int j =0; j < matrix[i].length; ++j) {
                ar.add(matrix[i][j]);
            }
        }
        Collections.sort(ar);
//        System.out.println(ar);
        return ar.get(k-1);

    }

    // kth smallest number from binary search Approach
    public static int kthSmallestUsingBinarySearch(int[][] matrix, int k) {

        int n = matrix.length, i = matrix[0][0], j = matrix[n - 1][n - 1];
        System.out.println("matrix length is :::  -> " + n);
        while (i < j) {
            int mid = i + (j - i) / 2;
            int posi = solve(matrix, mid);
            if (posi < k) i = mid + 1;
            else j = mid;
        }
        return i;
    }

    private static int solve(int[][] matrix, int mid) {
            int count = 0, n = matrix.length, i = n-1, j = 0;
            while(i >= 0 && j < n){
                if(matrix[i][j] > mid)
                    i--;
                else{
                    count += (i+1);
                    j++;
                }
            }
            return count;
        }

    /*
        rotate arr1 by 1 interval till size of arr1
        arr1 and arr2 same size
        arr1 = [5,10,3,2]
        arr1by1 = [2,5,10,3]
        arr1by2 = [3,2,5,10]
        arr1by3 = [10,3,2,5]
        arr2 = [9,7,5,8]

        output arrOut = [15,19]
     */
    public static int[] returnAbsoluteSum(int[] arr1, int[] arr2) {

        int len = arr1.length;
        int[] resArr = new int[len];

        for (int i=0; i <= len-1; i++) {
            int sum = 0;
            for (int j=0; j <= len-1; j++) {
                int diff = Math.abs(arr1[j] - arr2[j]);
                sum = sum + diff;
                diff = 0;
            }
            resArr[i] = sum;

            int temp = arr1[len-1];
            for(int k = len-1; k > 0; k--){
                arr1[k] = arr1[k-1];
            }
            arr1[0] = temp;

        }
        Arrays.sort(resArr);
        System.out.println(Arrays.toString(resArr));
        return resArr;
    }

    public static void main(String[] args) {

        int[][] arr = {{1,5,9}, {10,11,13}, {12,13,15}};

//        System.out.println(kthSmallestUsingBinarySearch(arr, 8));
//        System.out.println(kthSmallest(arr, 8));

        int[] arr1 = new int[] {5,10,3,2};
        int[] arr2 = new int[] {9,7,5,8};

        returnAbsoluteSum(arr1, arr2);
    }
}
