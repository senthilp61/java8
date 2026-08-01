package com.modernjava.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

    static void main() {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);

        var localDateTime1
                = LocalDateTime.of(2026, 07, 31, 19, 15, 33, 978);
        System.out.println("localDateTime1: " + localDateTime1);

        var localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime2: " + localDateTime2);

        /**
         * Getting the Time and Date from LocalDateTime instance
         */
        System.out.println("getHour: " + localDateTime.getHour());
        System.out.println("getMinute: " + localDateTime.getMinute());
        System.out.println("getDayOfMonth: " + localDateTime.getDayOfMonth());
        System.out.println("DAY_OF_MONTH: " + localDateTime.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying LocalDateTime
         */
        System.out.println("plusHours: " + localDateTime.plusHours(2));
        System.out.println("minusHours: " + localDateTime.minusHours(2));
        System.out.println("withMonth: " + localDateTime.withMonth(12));

        // converting localdate, localtime to localdatetime and viceversa
        var localDate = LocalDate.of(2026, 07, 31);
        System.out.println("atTime: " + localDate.atTime(23, 39));

        var localTime = LocalTime.of(23, 39);
        System.out.println("atDate: " + localTime.atDate(localDate));

        var localDateTIme3 = localTime.atDate(localDate);
        System.out.println("toLocalDate: " + localDateTIme3.toLocalDate());
        System.out.println("toLocalTime: " + localDateTIme3.toLocalTime());

    }
}
