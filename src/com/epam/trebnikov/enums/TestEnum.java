package com.epam.trebnikov.enums;

public enum TestEnum implements TestInterface{
    FIRST_ENUM("Первый енам"), SECOND_ENUM("Второй енам"), THIRD_ENUM("Третий енам");

    String translate;

    TestEnum(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

    @Override
    public String toString() {
        if (!name().contains("_")) {
            return name();
        } else {
            return name().replace("_", " ");
        }
    }
}
