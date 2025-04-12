package test.basics.pack1;

import java.io.IOException;

public class SubclassSamePackage extends Parent {

    private void methodPrivate() {
        System.out.println("private Method() of Subclass called...");
    }

    public void methodPublic() {
        System.out.println("Public Method() of Subclass called...");
    }

    protected void  methodProtected() {
        System.out.println("Protected Method() of Subclass called...");
    }

    public static void staticMtd() {
        System.out.println("static Method() of Subclass called...");
    }

    @Override
    public void testExceptionMtd() throws IOException {  // checked exception needs to be thrown at parent, if not then compilation error
        super.testExceptionMtd();
    }
}
