package ch27_Abstraction.abstract_polymorphism01;

import ch04_JavaOperators.A;

public abstract class AbstractClass {

    public static void byLinkText() { //concrete method
        System.out.println("Link text super");

    }

    public void get() { //concrete method
        System.out.println("chrome");

    }

    abstract void absMehtod();

}

class Test extends AbstractClass {
    public static void byLinkText() { //concrete method
        System.out.println("Link text sub class");

    }

    public void get() { //concrete method
        System.out.println("firefox");

    }

    @Override
    void absMehtod() {
        System.out.println("abs method override edildi");
    }

    public static void testMethod() {
        System.out.println("test method");
    }

    public static void main(String[] args) {
        Test.byLinkText();
        AbstractClass.byLinkText();

        //  AbstractClass obj = new AbstractClass()
        //'AbstractClass' is abstract; cannot be instantiated

        AbstractClass obj = new Test(); //polymorphism
        obj.absMehtod(); //abs method override edildi
        obj.get(); //firefox

    }
}