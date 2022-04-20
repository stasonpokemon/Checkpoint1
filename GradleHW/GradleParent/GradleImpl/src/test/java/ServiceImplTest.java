package com.epam.trebnikov.Gradle.GradleHW.GradleParent.GradleImpl.src.test.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceImplTest {

    @Test
    void sum() {
        int result = ServiceImpl.sum(3, 2);
        assertEquals(5, result);
    }
}