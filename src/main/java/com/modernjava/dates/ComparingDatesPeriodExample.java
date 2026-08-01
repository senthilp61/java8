package com.modernjava.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ComparingDatesPeriodExample {

    static void main() {
        var localDate = LocalDate.of(2026, 07, 31);
        var locaDate1 = LocalDate.of(2026, 12, 31);

        /**
         *
         */

        var period = localDate.until(locaDate1);
        System.out.println("getDays: " + period.getDays()); // result is 0 -> performs 31 - 31
        System.out.println("getMonths: " + period.getMonths()); // 12 - 7
        System.out.println("getYears: " + period.getYears()); //2026 - 2026

        var period1 = Period.ofDays(10);
        System.out.println("period1.getDays: " + period1.getDays());

        var period2 = Period.ofYears(10);
        System.out.println("period2.getYears: " + period2.getYears());
        System.out.println("toTotalMonths: " + period2.toTotalMonths());

        var period3 = Period.between(localDate, locaDate1);
        System.out.println("Period : " + period3.getDays() + " : " +period3.getMonths() + " : " + period3.getYears());

        //Period.between(LocalTime.now(), LocalTime.now().plusHours(24));
    }
}
