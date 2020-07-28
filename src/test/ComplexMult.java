package test;

import java.util.*;

class ComplexMult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int n = 0; n < t; n++) {
            int c = sc.nextInt();
            long r1 =sc.nextInt();
            long im1 =sc.nextInt();
            for(int i =0; i< c; i++){
                long re2 = sc.nextInt();
                long im2 = sc.nextInt();
                long temp = r1;

                r1 = r1*re2 - im1*im2;
                im1 = temp*im2 + im1*re2;

            }
            System.out.println(r1 +" " +im1);
        }

    }
}