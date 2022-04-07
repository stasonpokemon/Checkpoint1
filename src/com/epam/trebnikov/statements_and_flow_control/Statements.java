package com.epam.trebnikov.statements_and_flow_control;

public class Statements {
    public static void main(String[] args) {
//        test();
//        test1();
        Loop loop = new Loop();
//        loop.forEachLoop();
//        loop.whileLoop();
//        loop.doWileLoop();
//        loop.breakStatement();
//        loop.nestedBreakStatement();
//        loop.forLoopInfinite();
//        loop.forLoopContinueStatement();
//        loop.nestedContinueStatement();
//        loop.ifElseStatement();
//        loop.switchStatement();
//        loop.switchFallThroughStatement();
        System.out.println(loop.returnStatement());


    }

    /**
     * Write method with using an expression, a statement, a block
     */
    private static void test() {
//        expression
        int i = 13;
        int j = 15;
//        statement
        int result = i + j;
//        block
        if (result == 18) {
            System.out.println("result is 18...");
        }
    }

    /**
     * In class 'Loop' write method with 'for' loop with multiple initialization, termination, increment expressions
     */
    private static void test1() {
        double aValue;
        // assignment statement (присвоение)
        aValue = 8933.234;
        // increment statement (приращение)
        aValue++;
        // method invocation statement (вызов метода)
        System.out.println("Hello World!");
        // object creation statement (создание)
        Loop loop = new Loop();
    }
}
