package se8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

public class TestDateFormat {

    static String[] vals = {"A", "B"};


    public void test1(String s) {
        System.out.println(s);
    }

    public void test1(StringBuffer s) {
        System.out.println(s);
    }

    public static void testStr() {
        String a = new String("Jane");
        String b = new String("Doe");
        String c = new String("kane");
        System.out.println(a = b = c);
    }


    public static boolean checkDateFormat(String date) {
        DateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static void test() {
        System.out.println(vals[1]);
    }

    public static void testNullable(String optional) {
        optional = null;
        Optional<String> val = Optional.ofNullable(optional);
        System.out.println(val);

    }

    public static void main(String[] args) {
//        System.out.println(checkDateFormat("14-Sep-202$"));
//        test();
//        testNullable("opt");
//        test1(null);
        testStr();
    }

}
