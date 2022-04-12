package com.epam.trebnikov.operators;

public class Operators {
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
        test16();

    }

    /**
     * unary plus and minus operators: + -
     */
    private static void test() {
        int x = 10;
        int y = 10;
        System.out.println(x += 10);
        System.out.println(y -= 10);
    }

    /**
     * increment and decrement operators: ++ -- (prefix and postfix)
     */
    private static void test1() {
        int x = 10;
        int y = 10;
        System.out.println(x++); // 1 - print 2 - increment
        System.out.println(++x); // 1 - increment 2 - print
        System.out.println(y--); // 1 - print 2 - increment
        System.out.println(--y); // 1 - increment 2 - print
    }

    /**
     * arithmetic operators: + - * / %
     */
    private static void test2() {
        double x = 10;
        double y = 5;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
    }

    /**
     * String concatenation operator: +
     */
    private static void test3() {
        String str = "Hello ";
        System.out.println(str + "world!!");
    }

    /**
     * equality and relational operators: == != > >= < <=
     */
    private static void test4() {
        int x = 10;
        int y = 5;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x < y);
        System.out.println(x <= y);
    }

    /**
     * logical complement operator: !
     */
    private static void test5() {
        System.out.println(!true);
    }

    /**
     * logical operators: & |
     */
    private static void test6() {
        boolean x = true;
        boolean y = true;
        boolean z = false;
        boolean k = false;
        System.out.println("x & y is - " + (x & y));
        System.out.println("y & z is - " + (y & z));
        System.out.println("x | y is - " + (x | y));
        System.out.println("x | z is - " + (x | z));
        System.out.println("z | k is - " + (z | k));
    }

    /**
     * conditional operators: && ||
     */

    private static void test7() {
        boolean x = true;
        boolean y = true;
        boolean z = false;
        if (x && y) {
            System.out.println("x and y are true");
        }
        if (!x || !y || !z) {
            System.out.println("x or y or z is false");
        }
    }

    /**
     * bitwise complement operator: ~ (use hexadecimal numbers)
     */
    private static void test8() {
        byte number = 0x40; // 0100 000
        System.out.println(~number); // 1011 1111
    }

    /**
     * bitwise operators: & | ^ (use hexadecimal numbers)
     */
    private static void test9() {
        byte x = 0xf; // 0000 1111
        byte y = 0x20; // 0010 0000
        System.out.println(x & y); // 0000 0000
        System.out.println(x | y); // 0010 1111
        System.out.println(x ^ y); // 0010 1111
    }

    /**
     * simple assignment operator: =
     */
    private static void test10() {
        int x = 10;
        System.out.println(x);
    }

    /**
     * shortcut assignment operators
     */
    private static void test11() {
        int x = 3;
        int y = 13;
        int res = 0;
        res += x;
        System.out.println(res);
        res -= y;
        System.out.println(res);
        res *= x;
        System.out.println(res);
        res /= y;
        System.out.println(res);
    }

    /**
     * the ternary operator: ?:
     */
    private static void test12() {
        int x = 13;
        int y = 14;
        System.out.println(x > y ? "x > y" : "x < y");
    }

    /**
     * the instanceof operator (with class, subclass, null)
     */
    private static void test13() {
        Parent parent = new Child();
        System.out.println(parent instanceof Parent);
        System.out.println(parent instanceof Child);
        System.out.println(null instanceof Parent);
    }

    /**
     * the new operator
     */
    private static void test14() {
        String str = new String("Hello world!!!");
        System.out.println(str);
    }

    /**
     * the cast operator
     */
    private static void test15() {
        int x = 120;
        byte y = (byte) x;
        System.out.println(y);

        int a;
        byte b = 123;
        a = b;
        System.out.println(b);
    }

    /**
     * operators precedence
     */
    private static void test16() {
        byte byte1 = 13;
        byte byte2 = 15;
        int resultOfBytes  = byte1 + byte2;
        System.out.println(resultOfBytes);
    }
}
