package com.epam.trebnikov.statements_and_flow_control;

import com.epam.trebnikov.enums.TestEnum;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Loop {


    public void testMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println("value is " + i);
        }
    }

    //  множественная инициализация
    public void multipleInitialization() {
        int res;
        for (int i = 0; i < 10; i++) {
            res = i;
        }
    }

    //  прекращение
    public void termination() {
        int res;
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            res = i;
        }
    }

    //  приращение
    public void increment() {
        int res = 0;
        for (int i = 0; i < 10; i++) {
            res += i;
        }
    }

    /**
     * In class 'Loop' write method with the for-each loop (on array, enum, List)
     */
    public void forEachLoop() {
        String[] array = new String[]{"1", "2", "3"};
        List<String> list = new ArrayList<String>() {{
            add("1");
            add("1");
            add("1");
        }};
        EnumSet<TestEnum> enums = EnumSet.of(TestEnum.FIRST_ENUM, TestEnum.SECOND_ENUM, TestEnum.THIRD_ENUM);
        for (String str : array) {
            System.out.println(str);
        }
        for (String str : list) {
            System.out.println(str);
        }
        for (TestEnum anEnum : enums) {
            System.out.println(anEnum);
        }


    }

    /**
     * In class 'Loop' write method with the 'while' loop
     */
    public void whileLoop() {
        int i = 0;
        while (i != 5) {
            System.out.println(i);
            i++;
        }
    }

    /**
     * In class 'Loop' write method with the do-while loop
     */
    public void doWileLoop() {
        int i = 0;
        do {
            System.out.println(i);
        } while (i != 0);
    }

    /**
     * In class 'Loop' write method with the break statement
     */
    public void breakStatement() {
        for (int i = 0; i < 10; i++) {
            if (i > 7) {
                break;
            }
            System.out.println(i);
        }
    }

    /**
     * In class 'Loop' write method with the break statement with a label in nested loops
     */
    public void nestedBreakStatement() {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    System.out.print("- -");
                    break;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * In class 'Loop' write method with the for, while infinite loops
     */
    public void forLoopInfinite() {
        int i = 0;
        for (; ; ) {
            System.out.println(i++);
            if (i == 100) {
                break;
            }
        }
    }

    /**
     * In class 'Loop' write method with for loop with the continue statement
     */
    public void forLoopContinueStatement() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

    /**
     * In class 'Loop' write method with the continue statement with a label in nested loops
     */
    public void nestedContinueStatement() {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    System.out.print("- ");
                    continue;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * In class 'Loop' write method with the if-then, if-then-else statements
     */

    public void ifElseStatement() {
        int i = 6;
        if (i != 5) {
            System.out.println("i isn't five");
        }

        int j = 6;
        if (j != 5) {
            System.out.println("j isn't five, j is " + j);
        } else {
            System.out.println("j is five");
        }
    }

    /**
     * In class 'Loop' write method with the switch statement (on number, enum, String)
     */
    public void switchStatement() {
        int intOperation = 3;
        switch (intOperation){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("-");
        }

        String strOperation = "b";
        switch (strOperation){
            case "a":
                System.out.println("a");
                break;
            case "b":
                System.out.println("b");
                break;
            case "c":
                System.out.println("c");
                break;
            default:
                System.out.println("-");
        }

        TestEnum secondEnum = TestEnum.SECOND_ENUM;
        switch (secondEnum){
            case FIRST_ENUM:
                System.out.println("1 enum");
                break;
            case SECOND_ENUM:
                System.out.println("2 enum");
                break;

            case THIRD_ENUM:
                System.out.println("3 enum");
                break;
            default:
                System.out.println("it isn't enum");
        }
    }

    /**
     * In class 'Loop' write method with the switch statement with fall-through
     * */
    public void switchFallThroughStatement() {
        int intOperation = 3;
        switch (intOperation){
            case 1:
                System.out.println("1");
                break;
            case 2:
            case 3:
                System.out.println("2 or 3");
                break;
            default:
                System.out.println("-");
        }
    }

    /**
     * In class 'Loop' write method with the return statement (with and without value)
     * */
    public int returnStatement() {
        return 25/5;
    }
}
