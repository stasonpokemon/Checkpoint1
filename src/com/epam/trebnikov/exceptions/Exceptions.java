package com.epam.trebnikov.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Exceptions {
    public static void main(String[] args) {
//        test();
//        test1();
//        test2();
//        test3();
//        try {
//            test4();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        test5();
//        test6();
//        test7();
//        test8();
//        test9();
//        test10();
//        test11();
//        test12();
//        test13();
//        test14();
//        test15();
//        test16();
//        test17();
//        System.out.println(test18());
//        test19();
        System.out.println(test20());


    }

    /**
     * Get a list of 5 errors, show that they are errors by definition
     */
    private static void test() {
        List<Error> errors = new ArrayList<>();
        errors.add(new AbstractMethodError());
        errors.add(new StackOverflowError());
        errors.add(new IllegalAccessError());
        errors.add(new ClassFormatError());
        errors.add(new InstantiationError());
        errors.forEach(error -> error.printStackTrace());
    }

    /**
     * Get a list of 5 runtime exceptions, show that they are runtime exceptions by definition
     */
    private static void test1() {
        List<RuntimeException> runtimeExceptions = new ArrayList<>();
        runtimeExceptions.add(new NullPointerException());
        runtimeExceptions.add(new IndexOutOfBoundsException());
        runtimeExceptions.add(new ArithmeticException());
        runtimeExceptions.add(new IndexOutOfBoundsException());
        runtimeExceptions.add(new IllegalArgumentException());
        runtimeExceptions.forEach(r -> r.printStackTrace());
    }

    /**
     * Get a list of 5 checked exceptions, show that they are checked exceptions by definition
     */
    private static void test2() {
        List<Exception> exceptions = new ArrayList<>();
        exceptions.add(new SQLException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new IOException());
        exceptions.add(new ConnectException());
        exceptions.add(new SocketException());
        exceptions.forEach(e -> e.printStackTrace());
    }

    /**
     * Show that unchecked exception can be thrown from a method without declaration the throws clause
     */
    private static void test3() {
        throw new IndexOutOfBoundsException();
    }

    /**
     * Show that checked exception cannot be thrown from a method without declaration the throws clause
     */
    private static void test4() throws SQLException {
        throw new SQLException();
    }

    /**
     * Show that unchecked exception can be thrown and caught inside a method
     * without declaration the throws clause
     */
    private static void test5() {
        try {
            int result = 1 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    /**
     * Write try-catch-finally statement
     */
    private static void test6() {
        try {
            int result = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Catch case");
            e.printStackTrace();
        } finally {
            System.out.println("Finally case");
        }
    }

    /**
     * Write try-catch statement
     */
    private static void test7() {
        try {
            int result = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Catch case");
            e.printStackTrace();
        }
    }

    /**
     * Write try-catch statement with multiple catch blocks,
     * when one exception is a subclass of another
     */
    private static void test8() {
        try {
            int i = 1;
            if (i == 0) {
                throw new IndexOutOfBoundsException();
            } else {
                throw new SQLException();
            }
        } catch (SQLException | IndexOutOfBoundsException e) {
            System.out.println("Catch case");
            e.printStackTrace();
        }
    }

    /**
     * Write try-catch statement with multi-catch block
     */
    private static void test9() {
        try {
            int i = 1;
            if (i == 0) {
                throw new IndexOutOfBoundsException();
            } else {
                throw new SQLException();
            }
        } catch (SQLException e) {
            System.out.println("Catch case 1");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catch case 2");
            e.printStackTrace();
        }
    }

    /**
     * Write try-finally statement
     */
    private static void test10() {
        try {
            throw new IndexOutOfBoundsException();
        } finally {
            System.out.println("Finally case");
        }
    }

    /**
     * Write try-with-resources statement
     */
    private static void test11() {
        try (FileInputStream fileInputStream = new FileInputStream("src")) {
            // some text
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Show that thread is terminated if an exception is not caught
     */
    private static void test12() {
        try {
            throw new NullPointerException();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("End...");
    }

    /**
     * Use the interface Thread.UncaughtExceptionHandler
     */
    private static void test13() {
//        Thread.UncaughtExceptionHandler
    }

    /**
     * Use the methods getCause, getMessage of the Throwable class
     */
    private static void test14() {
        try {
            throw new SQLException("Some message", new FileNotFoundException("One more message"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }
    }

    /**
     * Use the methods getStackTrace, printStackTrace of the Throwable class
     */
    private static void test15() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println(e.getStackTrace().hashCode());
        }
    }

    /**
     * Throw one exception with another exception
     * as the cause constructor argument and use the getCause method in the catch block
     */
    private static void test16() {
        try {
            throw new SQLException(new FileNotFoundException("Some message"));
        } catch (SQLException e) {
            System.out.println(e.getCause().getMessage());
        }
    }

    /**
     * Show behavior of finally block after executing the System.exit method in a try block
     */
    private static void test17() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Catch case");
            System.exit(1);
        } finally {
            System.out.println("Finally case");
        }
    }

    /**
     * Show behavior of finally block if there is one value
     * return from try block and another value return from finally block
     */
    private static int test18() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Catch case");
            return 0;
        } finally {
            System.out.println("Finally case");
            return 1;
        }
    }

    /**
     * Show behavior of finally block if there is one thrown
     * exception from try block and another thrown exception from finally block
     */
    private static void test19() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Catch case");
        } finally {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Finally catch case");
            }
            System.out.println("Finally case");
        }
    }

    /**
     * Show behavior of finally block if there is thrown exception from try block
     * and value return from finally block
     */
    private static int test20() {
        try {
            throw new IndexOutOfBoundsException();
        } finally {
            return 1;
        }
    }

}
