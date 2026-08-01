package com.modernjava.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {

    static void main() {

        var localTime = LocalTime.of(7, 20);
        var localTime1 = LocalTime.of(8, 20);

        long diff = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("diff: " + diff);

        var duration = Duration.between(localTime, localTime1);
        System.out.println("toMinutes: " + duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println("duration1.toMinutes: " + duration1.toMinutes());


    }
}
