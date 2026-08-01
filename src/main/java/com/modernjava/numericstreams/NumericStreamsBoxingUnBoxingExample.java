package com.modernjava.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnBoxingExample {

    public static List<Integer> boxing() {

        return IntStream.rangeClosed(1, 10)
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList) {
            //wrapper to primitive
        return integerList.stream()
                //Wrapper Integer values
                .mapToInt(Integer::intValue) //intStream(intvalue of the wrapper class)
                .sum();

    }

    static void main() {
        System.out.println("Boxing: " +boxing());
        System.out.println("unBoxing: "+unBoxing(boxing()));
    }
}
