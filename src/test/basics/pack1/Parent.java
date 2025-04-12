package test.basics.pack1;

import java.io.IOException;

public class Parent {

    private int x = 50;
    protected int y = 100;
    int z = 200;

    private void methodPrivate() {
        System.out.println("Private Method() of Parent called...");
    }

    public void methodPublic() {
        System.out.println("Public Method() of Parent called...");
    }

    protected void methodProtected() {
        System.out.println("Protected Method() of Parent called...");
    }

    public static void staticMtd()  throws IOException {
        System.out.println("static Method() of Parent called...");
    }

    void defaultMtd() {
        System.out.println("static Method() of Parent called...");
    }

    public void testExceptionMtd() throws IOException {

    }
}
