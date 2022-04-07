package com.epam.trebnikov.strings;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    public static void main(String[] args) {
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
//        test18();
        test19();

    }


    /**
     * Create String from a literal, constructor, char[], byte[] and charset
     */
    private static void test() {
        String literal = "Hello world!!!";
        String constructor = new String("Hello world!!!");
        byte[] bytes = "Hello world!!!".getBytes();
        String fromBytes = new String(bytes);
        char[] chars = "Hello world!!!".toCharArray();
        String fromChar = new String(chars);

        System.out.println(literal);
        System.out.println(constructor);
        System.out.println(fromBytes);
        System.out.println(fromChar);
    }

    /**
     * Concatenate strings with the + operator and the concat methods
     */
    private static void test1() {
        String concatWithPlus = "Hello " + "world" + "!!!";
        System.out.println(concatWithPlus);
        String concatWithMethod = "Hello ".concat("world").concat("!!!");
        System.out.println(concatWithMethod);
    }

    /**
     * Convert String to Integer with the method Integer.valueOf(String)
     * (valid number string and causing NumberFormatException)
     */
    private static void test2() {
        Integer integer = Integer.valueOf("123");
        System.out.println(integer);
        try {
            Integer integer1 = Integer.valueOf("q");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Convert String to int with the method Integer.parseInt(String)
     * (valid number string and causing NumberFormatException)
     */
    private static void test3() {
        Integer integer = Integer.parseInt("123");
        System.out.println(integer);
        try {
            Integer integer1 = Integer.parseInt("q");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Convert Integer to String with the + operator: “” + i (not null and null)
     */
    private static void test4() {
        String str = "some text " + 3;
        System.out.println(str);
        String str1 = "some text " + null;
        System.out.println(str1);
    }

    /**
     * Convert int to String with the method String.valueOf(int) (not null and null)
     */
    private static void test5() {
        String str = String.valueOf(3);
        System.out.println(str);
        try {
            String str1 = String.valueOf(null);
            System.out.println(str1);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /**
     * Convert int to String with the method Integer.toString(int) (not null and null)
     */
    private static void test6() {
        String str = Integer.toString(3);
        System.out.println(str);
//        String str1 = Integer.toString(null);
        System.out.println(str);
    }

    /**
     * Use the methods: charAt, length, substring
     */
    private static void test7() {
        String str = "Hello world!!!";
        char c = str.charAt(2);
        int length = str.length();
        String substring = str.substring(0, 5);
        System.out.println(c);
        System.out.println(length);
        System.out.println(substring);
    }

    /**
     * Use the methods: split, trim, toLowerCase, toUpperCase, replace, replaceAll, replaceFirst
     */
    private static void test8() {
        String str = "    How can i help you?";
        String trim = str.trim();
        String[] splitOfTrim = trim.split(" ");
        String lowerCase = str.toLowerCase();
        String upperCase = str.toUpperCase();
        String replace = str.replace("can", "could");
        String replaceAll = str.replaceAll("[a-z]", "*");
        String replaceFirst = str.replaceFirst("o", "*");
        System.out.println("trim -> " + trim);
        System.out.print("split -> ");
        for (int i = 0; i < splitOfTrim.length; i++) {
            if (i != splitOfTrim.length - 1) {
                System.out.print(splitOfTrim[i] + ", ");
            } else {
                System.out.print(splitOfTrim[i] + ";");
            }
        }
        System.out.println("\nlowerCase -> " + lowerCase);
        System.out.println("upperCase -> " + upperCase);
        System.out.println("replace -> " + replace);
        System.out.println("replaceAll -> " + replaceAll);
        System.out.println("replaceFirst -> " + replaceFirst);
    }

    /**
     * Use the methods: indexOf, lastIndexOf, contains, startsWith, endsWith
     */
    private static void test9() {
        String str = "Hello world!!!";
        int indexOf = str.indexOf("o");
        int lastIndexOf = str.lastIndexOf("o");
        boolean contains = str.contains("o");
        boolean startsWith = str.startsWith("Hell");
        boolean endsWith = str.endsWith("!!!");
        System.out.println(indexOf);
        System.out.println(lastIndexOf);
        System.out.println(contains);
        System.out.println(startsWith);
        System.out.println(endsWith);
    }

    /**
     * Use the methods: compareTo, compareToIgnoreCase, equals, equalsIgnoreCase
     */
    private static void test10() {
        String str1 = "Hello!";
        String str2 = "Hello!";
        String str3 = "Hello";
        String str4 = "HELLO!";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str4));
        System.out.println(str1.compareToIgnoreCase(str4));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));
    }

    /**
     * Use the method String.format with boolean, integral, floating-point, character, String arguments
     */
    private static void test11() {
        System.out.println(String.format("boolean -> %b\nintegral -> %d\nfloating-point -> %.4f\ncharacter -> %c\nString -> %s", true, 123, 123.123, '4', "Hello"));
    }

    /**
     * Write a class and override its toString method
     */
    private static void test12() {
        OverrideToString str = new OverrideToString("Hello world! This is my message.");
        System.out.println(str);
    }

    /**
     * Use strings in the switch statement
     */
    private static void test13() {
        String arg = "apple";
        switch (arg) {
            case "banana":
                System.out.println("You chose banana!");
                break;
            case "apple":
                System.out.println("You chose apple!");
                break;
            case "orange":
                System.out.println("You chose orange!");
                break;
            default:
                System.out.println("You didn't chose anything:(");
        }
    }

    /**
     * Show, that string literals are equals by value (equals) to sting
     * created from a constructor
     */
    private static void test14() {
        String str = "Hello!";
        String str1 = new String("Hello!");
        System.out.println(str.equals(str1));
    }

    /**
     * Show, that string literals are equals by reference (==)
     */
    private static void test15() {
        String str = "Hello!";
        String str1 = "Hello!";
        System.out.println(str == str1);
    }


    /**
     * Show, that string created from a constructor is not equals by reference (!=)
     */
    private static void test16() {
        String str = new String("Hello!");
        String str1 = new String("Hello!");
        System.out.println(str == str1);
    }

    /**
     * Show that the intern methods make string created
     * from constructor equal by reference (==) to string literals
     */
    private static void test17() {
        String str = "Hello!";
        String intern = new String("Hello!").intern();
        System.out.println(str == intern);
    }


    /**
     * Use the methods append, toString of the classes StringBuffer, StringBuilder
     */
    private static void test18() {
        StringBuilder stringBuilder = new StringBuilder("Hello ");
        stringBuilder.append("world!!");
        System.out.println(stringBuilder);
        StringBuffer stringBuffer = new StringBuffer("Bye ");
        stringBuffer.append("world!!!");
        System.out.println(stringBuffer);
    }

    /**
     * Use the classes: Pattern, Matcher
     */
    private static void test19() {
        Pattern pattern = Pattern.compile("\\s+");
        String[] split = pattern.split("1   2 3123   42      51 7");
        System.out.println(Arrays.toString(split));

        Pattern pattern1 = Pattern.compile("\\s+");
        Matcher matcher = pattern1.matcher("+375 29 292 60 20");
        String str = matcher.replaceAll("-");
        System.out.println(str);

        String mailRegex = "\\w{6,}@\\w+\\.\\p{Lower}{2,4}";
        String mails = "e-mail: stasonpokemomn@icloud.com; pavel123@mail.ru; grishapavlov@yandex.ru";
        Pattern pattern2 = Pattern.compile(mailRegex);
        Matcher matcher1 = pattern2.matcher(mails);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        System.out.println(matcher1.replaceAll("---security email address is here---"));

        Pattern pattern3 = Pattern.compile("e-mail");
        Matcher matcher2 = pattern3.matcher(mails);
        System.out.println(matcher2.lookingAt()); // начинается ли строка с ***
        System.out.println(matcher2.matches()); // соответсвует ли строка полностью
    }
}
