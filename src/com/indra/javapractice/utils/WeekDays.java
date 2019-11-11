package com.indra.javapractice.utils;

public enum WeekDays {
    SUNDAY(1, "Sunday"),
    MONDAY(2, "Monday"),
    TUESDAY(3, "Tuesday"),
    WEDNESDAY(4, "Wednesday"),

    THURSDAY(5, "Thursday"),
    FRIDAY(6, "Friday"),
    SATURDAY(7, "Saturday");
    private int number;
    private String dayName;

    WeekDays(int i, String sunday) {
        this.number = i;
        this.dayName = sunday;
    }

    public int getNumber() {
        return number;
    }

    public String getDayName() {
        return dayName;
    }
}
