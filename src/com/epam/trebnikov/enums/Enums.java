package com.epam.trebnikov.enums;

import java.util.*;

public class Enums {
    public static void main(String[] args) {

//        test();
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
        test8();


    }

    /**
     * Use the methods: name, toString, ordinal
     */
    private static void test() {
        System.out.println(TestEnum.FIRST_ENUM.name());
        System.out.println(TestEnum.SECOND_ENUM);
        System.out.println(TestEnum.THIRD_ENUM.ordinal());
    }

    /**
     * Override the methods toString where convert name to the lower case and replace ‘_’ with ‘ ’
     */
    private static void test1() {
        System.out.println(TestEnum.FIRST_ENUM);
    }

    /**
     * Use the method valueOf(String) to convert String to enum type (valid and invalid)
     */
    private static void test2() {
        System.out.println(TestEnum.valueOf("FIRST_ENUM"));
        try {
            System.out.println(TestEnum.valueOf("NULL"));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get list of all enum constants with the method values()
     */
    private static void test3() {
        TestEnum[] values = TestEnum.values();
        System.out.println(Arrays.toString(values));
    }

    /**
     * Convert String to enum constant by iteration of the values() method result and
     * return Optional.of() in case of success and Optional.empty() in case of failure
     */
    private static void test4() {
        TestEnum[] values = TestEnum.values();
        for (TestEnum value : values) {
            Optional<TestEnum> optionalTestEnum = Optional.of(value);
            System.out.println(optionalTestEnum.get());
        }
    }

    /**
     * Show that the same enum constants are equals by value (equals) and by reference (==)
     */
    private static void test5() {
        System.out.println(TestEnum.FIRST_ENUM.equals(TestEnum.FIRST_ENUM));
        System.out.println(TestEnum.SECOND_ENUM == TestEnum.SECOND_ENUM);
    }

    /**
     * Use enum to get values in a switch statement and
     * show that enum fields are a simpler solution
     */
    private static void test6() {
        TestEnum secondEnum = TestEnum.SECOND_ENUM;
        switch (secondEnum) {
            case FIRST_ENUM:
                System.out.println("You chose 1 enum");
                break;
            case SECOND_ENUM:
                System.out.println("You chose 2 enum");
                break;
            case THIRD_ENUM:
                System.out.println("You chose 3 enum");
                break;
            default:
                System.out.println("You didn't chose enum");
        }
    }

    /**
     * Implement Singleton design pattern with enum
     */
    private static void test7() {
        SingletonEnum singletonEnum = SingletonEnum.GETINSTANCE;
        SingletonEnum singletonEnum1 = SingletonEnum.GETINSTANCE;
        System.out.println(singletonEnum.hashCode());
        System.out.println(singletonEnum1.hashCode());
    }

    /**
     * Use the classes: EnumSet, EnumMap
     */
    private static void test8() {
        EnumSet<DaysOfTheWeek> weekend = EnumSet.of(DaysOfTheWeek.SATURDAY, DaysOfTheWeek.SUNDAY);
        System.out.println("Test EnumSet -> " + weekend);

        List<DaysOfTheWeek> weekendList = new ArrayList<>();
        weekendList.add(DaysOfTheWeek.SATURDAY);
        weekendList.add(DaysOfTheWeek.SUNDAY);

        List<DaysOfTheWeek> workDaysList = new ArrayList<>();
        workDaysList.add(DaysOfTheWeek.MONDAY);
        workDaysList.add(DaysOfTheWeek.TUESDAY);
        workDaysList.add(DaysOfTheWeek.WEDNESDAY);
        workDaysList.add(DaysOfTheWeek.THURSDAY);
        workDaysList.add(DaysOfTheWeek.FRIDAY);

        EnumMap<TypeOfDaysOfTheWeek, List<DaysOfTheWeek>> daysOfTheWeek = new EnumMap<>(TypeOfDaysOfTheWeek.class);
        daysOfTheWeek.put(TypeOfDaysOfTheWeek.WORK_DAY, workDaysList);
        daysOfTheWeek.put(TypeOfDaysOfTheWeek.DAY_OFF, weekendList);

        List<DaysOfTheWeek> daysOfTheWeeks = daysOfTheWeek.get(TypeOfDaysOfTheWeek.DAY_OFF);
        System.out.println("Test EnumMap -> " + Arrays.toString(daysOfTheWeeks.toArray()));
    }

}
