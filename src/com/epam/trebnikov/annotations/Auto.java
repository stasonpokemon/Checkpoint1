package com.epam.trebnikov.annotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Auto implements CarStopInterface {

    @TestAnnotation("model")
    private String model;
    @TestAnnotation(value = "color")
    private String color;


    /**
     * @deprecated it is too long method
     */
    @Deprecated
    public void start(boolean engineCondition) {
        if (engineCondition) {
            System.out.println("Start car!");
        } else {
            System.out.println("Some engine errors");
        }
    }

    public void startModern(boolean engineCondition) {
        System.out.println(engineCondition ? "Start car!" : "Some engine errors");
    }

    @SuppressWarnings("deprecation")
    public void catchTheWarning1() {
        start(true);
    }

    @SuppressWarnings("all")
    public void catchTheWarning() {
        List<String> strings = new ArrayList();
    }

    @SafeVarargs
    public final void catchTheVarArgsWarning(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = Arrays.asList(42);
        array[0] = tmpList; // Semantically invalid, but compiles without warnings
        String s = stringLists[0].get(0); // Oh no, ClassCastException at runtime!
    }

}
