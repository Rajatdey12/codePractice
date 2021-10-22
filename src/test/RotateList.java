package test;

import java.util.Arrays;

public class RotateList {

    public static void rotateRight(int[] a, int times, int iterations) {
        System.out.println("Original Array -> " + Arrays.toString(a));

        for (int iters =0; iters < iterations; iters++) {
            for (int i = 0; i < times; i++) {
                int temp = a[a.length - 1];
                for (int j = a.length - 1; j > 0; j--) {
                    a[j] = a[j - 1];
                }
                a[0] = temp;
            }
            System.out.println("Rotated Array To Right -> " + Arrays.toString(a));
        }
    }

    public static void rotateLeft(int[] a, int times, int iterations) {
        System.out.println("Original array -> " + Arrays.toString(a));
        for (int iters =0; iters < iterations; iters++) {
            for (int time = 0; time < times; time++) {
                int temp = a[0];
                for (int j = 0; j < a.length-1; j++) {
                    a[j] = a[j+1];
                }
                a[a.length-1] = temp;
            }
            System.out.println("Rotated Array to Left -> " + Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        rotateRight(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 7);
        rotateLeft(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 7);
    }
}
