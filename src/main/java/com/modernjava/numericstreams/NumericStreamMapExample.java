package com.modernjava.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj() {

        return IntStream.rangeClosed(1, 5)
                .mapToObj(i -> new Integer(i))
                .collect(Collectors.toList());
    }

    public static long mapToLong() {

        return IntStream.rangeClosed(1, 5) //intstream
                //i is passed from the intstream
                .mapToLong(i -> i) //convert intstream to longStream
                .sum();
    }

    public static double mapToDouble() {

        return IntStream.rangeClosed(1, 5)
                .mapToDouble(i -> i) //convert intstream to double
                .sum();
    }

    static void main() {

        System.out.println("mapToObj: "+mapToObj());
    }
}
