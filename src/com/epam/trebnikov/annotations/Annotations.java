package com.epam.trebnikov.annotations;

import java.lang.reflect.Field;

public class Annotations {
    public static void main(String[] args) {
        for (Field declaredField : Auto.class.getDeclaredFields()) {
            System.out.println(declaredField.getAnnotation(TestAnnotation.class));
        }
    }
}
