package test;

public class MSTest {

    // method will return a boolean value,
    // input two strings
    // if two strings are rotation of each other
    // abc <-> cab

    public static boolean isRotation(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        String concatenated = s1 + s2;
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("rajat", "atraj"));
    }
}
