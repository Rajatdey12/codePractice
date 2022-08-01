package se8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

public class TestDateFormat {

    static String[] vals = {"A", "B"};


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
        testNullable("opt");
    }
}
