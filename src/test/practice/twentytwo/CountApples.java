package test.practice.twentytwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountApples {

    /*
    Count the apples by group based on their weights and max weight difference
    where max_size_difference is input param.
    Approach taken is two pointer.
     */

    public static int find_max_apples(int max_size_difference, List<Integer> apple_sizes) {

        Collections.sort(apple_sizes);

        int i = 0;
        int j = 1;
        int max = 0;

        while (i < apple_sizes.size() && j < apple_sizes.size()) {
            if (apple_sizes.get(j) - apple_sizes.get(i) <= max_size_difference) {
                j++;
            } else {
                i++;
            }
            max = Math.max(max, j - i);
        }
        System.out.println(max);
        return max;

    }

    public static void main(String[] args) {

        List<Integer> inpLst = Arrays.asList(4, 2, 6, 100, 101, 101, 110, 102);
        int max_diff = 2;
        find_max_apples(max_diff, inpLst);
    }

}

