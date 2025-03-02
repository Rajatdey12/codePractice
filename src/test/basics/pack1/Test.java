package test.basics.pack1;

import test.basics.pack1.Parent;
import test.basics.pack1.SubclassSamePackage;
import test.basics.pack2.SubClass;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        SubClass b = new SubClass();
        System.out.println(b.x); // compile error

        System.out.println(b.y);
        System.out.println(b.z);
        
        b.methodPublic();
        b.methodProtected();
        // calling static method of class Subclass.
        SubClass.staticMtd();

        
        // creating instance of class Parent
        Parent a = new Parent();
        
        // calling static method of class Parent
        Parent.staticMtd();
        a.methodPublic();
        a.methodProtected();
        a.defaultMtd();

        SubclassSamePackage c = new SubclassSamePackage();
        c.methodPublic();
        c.methodProtected();
    }
}
