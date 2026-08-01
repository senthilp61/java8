package com.modernjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integers) {

        return integers.stream()
                .reduce(0, (x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integers) {

        return integers.stream()
                .reduce((x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integers) {

        return integers.stream()
                .reduce((x, y) -> x < y ? x : y);
    }

    static void main() {

        var integers = Arrays.asList(6, 7, 8, 9, 10);
        //List<Integer> integers = new ArrayList<>();
        System.out.println("findMaxValue: " + findMaxValue(integers));

        var maxValueOptional = findMaxValueOptional(integers);
        if(maxValueOptional.isPresent()) {
            System.out.println("MaxValue using optional :" + maxValueOptional.get());
        }
        else {
            System.out.println("No Max Value found");
        }

        var minValueOptional = findMinValueOptional(integers);
        if(minValueOptional.isPresent()) {
            System.out.println("minValueOptional : " + minValueOptional.get());
        }
        else {
            System.out.println("No Min Value found");
        }
    }
}
