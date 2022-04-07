package com.epam.trebnikov.enums;

public enum SingletonEnum {
    GETINSTANCE;

    public String message() {
        return "Hello!!! It is a singleton enum...";
    }
}
