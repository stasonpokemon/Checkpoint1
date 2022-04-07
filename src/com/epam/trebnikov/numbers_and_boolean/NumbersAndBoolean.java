package com.epam.trebnikov.numbers_and_boolean;


import java.math.BigDecimal;
import java.math.BigInteger;

public class NumbersAndBoolean {
    public static void main(String[] args) {
        assertEquals(12,123);
//        test();
//        test1();
//        test2();
//        test3();
//        test4();
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

    }

    private static int assertEquals(int firstInt, int secondInt){
            Integer integer = Integer.valueOf(firstInt);
            Integer integer1 = Integer.valueOf(secondInt);
            return integer.compareTo(integer1);

    }


    /**
     * Initialize local variable with decimal, hexadecimal, boolean, literals, underscore characters in integral literals
     * - Числовые литералы
     * - Строковые литералы
     * - Символьные литералы
     * - Логические литералы
     */
    private static void test() {
        int decimal = 10; // decimal
        int hexadecimal = 0x10; // hexadecimal
        boolean bool = true; // boolean
        String str = "Hello world!!!"; // literals
        long underscoreCharacters = 100_000_000l; // underscore characters
        System.out.println(decimal);
        System.out.println(hexadecimal);
        System.out.println(bool);
        System.out.println(str);
        System.out.println(underscoreCharacters);
    }

    /**
     * Use Boolean and boolean types: convert them from and to String
     */
    private static void test1() {
        boolean a = true;
        Boolean b = true;
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        System.out.println(s);
        System.out.println(s1);
    }

    /**
     * Write to console constants MIN_VALUE, MAX_VALUE for each integral wrapper class
     */
    private static void test2() {
        System.out.println("Byte max value: " + Byte.MAX_VALUE);
        System.out.println("Byte min value: " + Byte.MIN_VALUE);
        System.out.println("Short maz value: " + Short.MAX_VALUE);
        System.out.println("Short min value: " + Short.MIN_VALUE);
        System.out.println("Integer max value: " + Integer.MAX_VALUE);
        System.out.println("Integer min value: " + Integer.MIN_VALUE);
        System.out.println("Long max value: " + Long.MAX_VALUE);
        System.out.println("Long min value: " + Long.MIN_VALUE);
        System.out.println("Float max value: " + Float.MAX_VALUE);
        System.out.println("Float min value: " + Float.MIN_VALUE);
        System.out.println("Double max value: " + Double.MAX_VALUE);
        System.out.println("Double min value: " + Double.MIN_VALUE);
        System.out.println("Character max value: " + Character.MAX_VALUE);
        System.out.println("Character min value: " + Character.MIN_VALUE);
        System.out.println("Boolean max value: " + Boolean.TRUE);
        System.out.println("Boolean min value: " + Boolean.FALSE);
    }

    /**
     * Use int and Integer types: convert them from and to String (decimal and hexadecimal numbers)
     */
    private static void test3() {
        Integer decimalInteger = 16;
        Integer hexadecimalInteger = 0X10;
        int decimalInt = 17;
        int hexadecimalInt = 0x11;
        System.out.println("Decimal Integer -> " + decimalInteger + ";" + "\nHexadecimal Integer -> " + hexadecimalInteger + ";" + "\nDecimal Int -> " + decimalInt + ";" + "\nHexadecimal Int -> " + hexadecimalInt + ".");
    }

    /**
     * Use Integer type: converting from int in the constructor and in the valueOf method
     */

    private static void test4() {
        int a = 13;
        Integer integer = Integer.valueOf(a);
        System.out.println(integer);
    }


    /**
     * int: write code to manual boxing, unboxing and autoboxing
     */
    private static void test5() {
        Integer a = Integer.valueOf(123); // manual boxing
        Integer b = 123;
        int i = b.intValue(); // manual unboxing
    }

    /**
     * int: overflow and underflow without exception
     */
    private static void test6() {
        int i = Integer.MAX_VALUE + 1;
        System.out.println(i); // При прибавлении к Integer.MAX_VALUE единицы число перевараяивается и становиться Integer.MIN_VALUE
        System.out.println(Integer.MIN_VALUE == i);

        int i1 = Integer.MIN_VALUE - 1;
        System.out.println(i1); // При уменьшении Integer.MIN_VALUE на единицу число перевараяивается и становиться Integer.MAXVALUE
        System.out.println(Integer.MAX_VALUE == i1);
    }

    /**
     * int: write code to get exception during / % division by 0
     */
    private static void test7() {
        try {
            int result = 13 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    /**
     * Use int: write code with min, max, abs methods of the Math class
     */
    private static void test8() {
        System.out.println("Min " + Math.min(3, 12));
        System.out.println("Max " + Math.max(3, 12));
        System.out.println("Abs " + Math.abs(-12));
    }

    /**
     * Use integral types: widening and narrowing
     */
    private static void test9() {
        int bigNumber = 10000000;
        byte littleNumber = 16;
        bigNumber = littleNumber;
        System.out.println("Расширение -> " + bigNumber);
        int bigNumber1 = 10000000;
        short littleNumber1 = 1000;
        littleNumber1 = (short) bigNumber;
        System.out.println("Сужение -> " + littleNumber1);

    }


    /**
     * Use float and double literals (standard and scientific notation)
     */
    private static void test10() {
        double standardDouble = 123.12;
        System.out.println(standardDouble);
        double scientificDouble = 5.07e2;
        System.out.println(scientificDouble);
        float standardFloat = 342.42f;
        System.out.println(standardFloat);
        float scientificFloat = 214.7e2f;
        System.out.println(scientificFloat);
    }

    /**
     * Use float and Float types: convert them from and to String
     */
    private static void test11() {
        Float f = 123.21f;
        float f1 = 214.11f;
        String s = String.valueOf(f);
        String s1 = String.valueOf(f1);
        System.out.println(s);
        System.out.println(s1);

    }

    /**
     * Write to console constants MIN_VALUE, MAX_VALUE, POSITIVE_INFINITY,
     * NEGATIVE_INFINITY, NaN for each float-point wrapper class
     */
    private static void test12() {
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.POSITIVE_INFINITY);
        System.out.println(Float.NEGATIVE_INFINITY);
        System.out.println(Float.NaN);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN);
    }

    /**
     * Use float type: NaN during / division by 0
     */
    private static void test13() {
        float result = Float.NaN / 0;
        System.out.println(result);

    }

    /**
     * Formation floating-point numbers with the System.out.format and System.out.printf methods
     */
    private static void test14() {
        System.out.format("First Double number -> %.3f;\n", 2.31231);
        System.out.printf("Second Double number -> %.5f;", 123.41243);
    }

    /**
     * BigInteger: the add, subtract, multiply, divide methods
     */
    private static void test15() {
        BigInteger bigInt = new BigInteger("400");
        BigInteger bigInt1 = new BigInteger("199");
        BigInteger add = bigInt.add(bigInt1);
        System.out.println(add);
        BigInteger subtract = bigInt.subtract(bigInt1);
        System.out.println(subtract);
        BigInteger multiply = bigInt.multiply(bigInt1);
        System.out.println(multiply);
        BigInteger divide = bigInt.divide(bigInt1);
        System.out.println(divide);



    }

    /**
     * BigDecimal: the add, subtract, multiply, divide methods
     */
    private static void test16() {
        BigDecimal bigDec = new BigDecimal("13.5");
        BigDecimal bigDec1 = new BigDecimal("2.5");
        BigDecimal add = bigDec.add(bigDec1);
        System.out.println(add);
        BigDecimal subtract = bigDec.subtract(bigDec1);
        System.out.println(subtract);
        BigDecimal multiply = bigDec.multiply(bigDec1);
        System.out.println(multiply);
        System.out.println(bigDec.divide(bigDec1));
    }

    /**
     * BigDecimal: specific behavior the equals, compareTo methods
     */
    private static void test17() {
        BigDecimal bigDec = new BigDecimal("13.5");
        BigDecimal bigDec1 = new BigDecimal("13.5");
        System.out.println(bigDec.equals(bigDec1));
        System.out.println(bigDec.compareTo(bigDec1));
    }


}
