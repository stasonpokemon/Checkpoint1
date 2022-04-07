package com.epam.trebnikov.packages;

import com.epam.trebnikov.enums.TestEnum;
import static com.epam.trebnikov.packages.TestClass.a;
import static com.epam.trebnikov.packages.TestClass.b;

public class Main {
    public static void main(String[] args) {
//        test();
//        test1();
//        test2();
//        test3();
        test4();

    }

    /**
     * Write code to get fully qualified class name, using Class.getName() for class and object
     */
    private static void test() {
        String name = TestClass.class.getName();
        System.out.println(name);
        TestClass testClass = new TestClass();
        System.out.println(testClass.getClass().getName());
    }

    /**
     * Create two classes with similar names and try to use this classes in one application
     **/
    private static void test1() {
        TestClass testClass = new TestClass();
        com.epam.trebnikov.packages.some_package.TestClass testClass1 = new com.epam.trebnikov.packages.some_package.TestClass();
    }


    /**
     * Add import with wildcard
     **/
    private static void test2() {
        TestEnum testEnum = TestEnum.FIRST_ENUM;
    }

    /**
     * Use static import and wildcard static import public static fields and static methods
     */
    private static void test3() {
        b(a.toString());
    }

    /**
     * Use Implicit import from the java.lang package
     * */
    private static void test4() {
        String str = "String class is implicit import from the java.lang package";
        System.out.println(str);

    }
}
