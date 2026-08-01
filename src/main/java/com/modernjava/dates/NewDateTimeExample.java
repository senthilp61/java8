package com.modernjava.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {

    static void main() {

        //LocalDate
        var localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);
        //LocalTime
        var localTime = LocalTime.now();
        System.out.println("localTime: " + localTime);
        //LocalDateTime
        var localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);
    }
}
