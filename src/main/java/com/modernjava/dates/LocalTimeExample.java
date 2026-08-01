package com.modernjava.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    static void main() {

        var localTime = LocalTime.now();
        System.out.println("localTime: " + localTime);

        var localTime1 = LocalTime.of(23, 33);
        System.out.println("localTime1: " + localTime1);

        var localTime2 = LocalTime.of(23, 33, 33);
        System.out.println("localTime2: " + localTime2);

        var localTime3 = LocalTime.of(23, 33, 33, 989098098);
        System.out.println("localTime3: " + localTime3);

        /**
         * getting the values from local time instance
         */
        System.out.println("getHour: " + localTime.getHour());
        System.out.println("getMinute: " + localTime.getMinute());
        System.out.println("CLOCK_HOUR_OF_DAY: " + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("toSecondOfDay: " + localTime.toSecondOfDay()); // represent the time in seconds

        System.out.println("minusHours: " + localTime.minusHours(2));
        System.out.println("ChronoUnit.HOURS: "
                + localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("MIDNIGHT: " + localTime.with(LocalTime.MIDNIGHT));
        System.out.println("HOUR_OF_DAY: "
                + localTime.with(ChronoField.HOUR_OF_DAY, 22));
        System.out.println("plusMinutes: "
                + localTime.plusMinutes(30));
        System.out.println("withHour: " + localTime.withHour(10));

    }
}
