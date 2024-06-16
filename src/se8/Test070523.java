package se8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test070523 {

    public static void main(String[] args) {
//        test1(null);
//        try {
//            testExceptions();
//            List<String> li = new ArrayList<>(2);
//            System.out.println(li);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Test070523Child parent = new Test070523Child();
        parent.mtd1();


    }

    public static void testExceptions() throws FileNotFoundException, IOException {
    }

//    public static void test1(String s) {
//        System.out.println("String mtd called");
//    }
//
//    public static void test1(Object s) {
//        System.out.println("Object mtd called");
//    }

    public static void mtd1() {
        System.out.println("I am parent");
    }
}
