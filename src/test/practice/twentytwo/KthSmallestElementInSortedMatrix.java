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

    public static void main(String[] args) {
        int[][] arr = {{1,5,9}, {10,11,13}, {12,13,15}};

        System.out.println(kthSmallestUsingBinarySearch(arr, 8));
        System.out.println(kthSmallest(arr, 8));
    }
}
