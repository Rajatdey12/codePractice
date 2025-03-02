package test.basics.pack2;

import test.basics.pack1.Parent;

public class SubClass extends Parent {

    private void methodPrivate() {
        System.out.println("private Method() of Subclass called...");
    }

    public void methodPublic() {
        System.out.println("Public Method() of Subclass called...");
    }

    protected void methodProtected() {
        System.out.println("Protected Method() of Subclass called...");
    }

    public static void staticMtd() {
        System.out.println("static Method() of Subclass called...");
    }
}
