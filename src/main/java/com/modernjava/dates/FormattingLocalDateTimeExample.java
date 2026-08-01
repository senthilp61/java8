package com.modernjava.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormattingLocalDateTimeExample {

    public static void parseLocalDateTime() {

        String dateTime = "2026-08-01T01:25:33";

        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println("localDateTime: " + localDateTime);

        LocalDateTime localDateTime1
                = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println("localDateTime1: " + localDateTime1);

        /**
         * custom format
         */

        String dateTime2 = "2026-08-01T01|28|33";
        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
        LocalDateTime localDateTime2
                = LocalDateTime.parse(dateTime2, dateTimeFormatter);
        System.out.println("localDateTime2: " + localDateTime2);

        String dateTime3 = "2026-08-01abc01|31|33";
        DateTimeFormatter dateTimeFormatter1
                = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime3 = LocalDateTime.parse(dateTime3, dateTimeFormatter1);
        System.out.println("localDateTime3: " + localDateTime3);

    }

    public static void formatLocalDateTime() {

        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String convertedDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("convertedDateTime: " + convertedDateTime);
    }

    static void main() {
        parseLocalDateTime();
        formatLocalDateTime();
    }
}
