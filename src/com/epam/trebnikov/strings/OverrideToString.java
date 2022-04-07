package com.epam.trebnikov.strings;

public class OverrideToString {
    private String message;

    public OverrideToString(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


    @Override
    public String toString() {
        return "message is: " + message;
    }
}
