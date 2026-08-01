package com.modernjava.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    static void main() {

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        var localDate1 = LocalDate.of(2026, 8, 01);
        System.out.println("localDate1: " + localDate1);

        var localDate2 = LocalDate.ofYearDay(2026, 212);
        System.out.println("localDate2: " + localDate2);

        /**
         * Get values from localDate
         */

        System.out.println("getMonth: " + localDate.getMonth());
        System.out.println("getMonthValue: " + localDate.getMonthValue());
        System.out.println("getDayOfWeek: " + localDate.getDayOfWeek());
        System.out.println("getDayOfYear: " + localDate.getDayOfYear());
        System.out.println("Day of Month using get: " +
                localDate.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying LocalDate
         */
        System.out.println("plusDays: " + localDate.plusDays(2));
        System.out.println("plusMonths: " + localDate.plusMonths(2));
        System.out.println("minusDays: " + localDate.minusDays(2));
        System.out.println("withYear: " + localDate.withYear(2028));
        System.out.println("with ChronoField: "
                + localDate.with(ChronoField.YEAR, 2030));
        System.out.println("with TemporalAdjusters: "
                + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("chronounit minus: "
                + localDate.minus(1, ChronoUnit.YEARS));

        /**
         * Unsupported
         */
        /*System.out.println("chronounit minus: "
                + localDate.minus(1, ChronoUnit.MINUTES));*/
        System.out.println("isSupported: " + localDate.isSupported(ChronoUnit.MINUTES));
        System.out.println("isSupported: " + localDate.isSupported(ChronoUnit.YEARS));

        /**
         * Additional Support methods
         */
        System.out.println("leapyear: "
                + LocalDate.ofYearDay(2026, 01).isLeapYear());
        System.out.println("leapyear: "
                + LocalDate.ofYearDay(2024, 01).isLeapYear());

        //localDate: 2026-07-31
        //localDate1: 2026-08-01
        System.out.println("isEqual: " + localDate.isEqual(localDate1));
        System.out.println("isBefore: " + localDate.isBefore(localDate1));
        System.out.println("isAfter: " + localDate1.isAfter(localDate));

    }
}
