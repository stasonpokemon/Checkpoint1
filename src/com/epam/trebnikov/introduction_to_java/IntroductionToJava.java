package com.epam.trebnikov.introduction_to_java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntroductionToJava {

    /**
     * Write method which will return JDK version.
     * Use System.getProperty("java.version") and output in console (screenshot)
     */
    public String JDKVersion() {
        return System.getProperty("java.version");
    }

    /**
     * Write method which will return.
     * Use System.getenv("JAVA_HOME") and output in console (screenshot)
     */
    public String javaHome() {
        return System.getenv("JAVA_HOME");
    }

    /**
     * Convey command-line arguments to application and get them from the arguments of the public
     * static void main(String[] args) method. Conveyed arguments should output in console
     */
    public void passingArgumentsToMain(String... args) {
        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                System.out.print("Passed arguments:" + args[0]);
            } else if (i != 0 && i < args.length - 1) {
                System.out.print(", " + args[i]);
            } else {
                System.out.println(", " + args[i] + ";");
            }
        }
    }

    /**
     * Pass system property by command-line argument -Dname=value and get
     * its value by name with the method System.getProperty("name") (screenshot)
     */
    public void propertyByCommandLineArgument(String... args) {
        System.setProperty("name", args[0]);
        String name = System.getProperty("name");
        System.out.println("Name is " + name);
    }

    /**
     * Write method which will exit from an application with System.exit(-1)
     * and get console message (screenshot)
     */
    public void exitMethod() {
        System.out.println("Message before exit...");
        System.exit(1);
        System.out.println("Message after exit...");
    }

    /**
     * Write new array(new int[]{0}): use the methods toString, hashCode, equals, instanceof
     * Object for it and output outcome in console
     **/
    public void test() {
        int[] array = new int[]{0};
        int[] array1 = new int[]{0, 1};
        System.out.println(array.toString());
        System.out.println(Arrays.toString(array));
        System.out.println(array.hashCode());
        System.out.println(array.equals(array1));
        System.out.println(array instanceof int[]);
    }

    /**
     * Work with array: create, set and get value, get the length property
     */
    public void arrayTest() {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        int getI = array[4];
        System.out.println(getI);
        int length = array.length;
        System.out.println(length);
    }

    /**
     * Write code with array to get ArrayIndexOutOfBoundsException
     */
    public void arrayTest1() {
        int[] array = new int[5];
        try {
            for (int i = 0; i < 10; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    /**
     * The Object class: Create a few instances of class <Cat> use methods
     * equals (with true and false results), hashCode, toString, getClass
     */
    public void objectTest() {
        Cat cat1 = new Cat("Barsik", 6);
        Cat cat2 = new Cat("Barsik", 6);
        Cat cat3 = new Cat("Chunia", 2);
        Cat cat4 = new Cat("Chinazez", 4);
        System.out.println(cat1.equals(cat2)); // true,  because i realised methods equals and hashcode
        System.out.println(cat1.equals(cat3));
        System.out.println(cat1.hashCode() == cat2.hashCode()); // true,  because i realised methods equals and hashcode
        System.out.println(cat1.hashCode() == cat3.hashCode());
        System.out.println(cat1.toString());
        System.out.println(cat1.getClass().getName());
    }

    /**
     * The Class class: Use classes from previous criteria and use methods getName, getPackage to them
     * */
    public void objectTest1() {
        Cat cat = new Cat("Barsik", 6);
        System.out.println(cat.getClass().getName());
        System.out.println(cat.getClass().getPackage());
    }

    /**
     * Write method which will throw NullPointerException (Don't use 'throw' operator)
     * */
    public void testNullPointerException() {
        List<Cat> cats = new ArrayList<>();
        cats.add(null);
        Cat cat = cats.get(0);
        String name = cat.getName();
        System.out.println(name);
    }

    /**
     * Write code to get StackOverflowError
     * */
    public void stackOverflowErrorTest() {
        System.out.println(System.currentTimeMillis());
        stackOverflowErrorTest();
    }

    /**
     * Write to console results from the methods freeMemory, maxMemory, totalMemory of the Runtime class get OutOfMemoryError
     * */
    public void outOfMemoryErrorTest(){
        long freeMemory = Runtime.getRuntime().freeMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println(freeMemory);
        System.out.println(maxMemory);
        System.out.println(totalMemory);
        List<Object[]> objects = new ArrayList<>();
        for (;;){
            objects.add(new Object[100]);
        }
    }
}
