package com.modernjava.parallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    public static int sequentialSum(List<Integer> integerList) {

        long start = System.currentTimeMillis();
        int sum = integerList.stream()
                .reduce(0, (x, y) -> x+y);
        long duration = System.currentTimeMillis() - start;
        System.out.println("Duration in Sequential Stream: " + duration);
        return sum;
    }

    public static int parallelSum(List<Integer> integerList) {

        long start = System.currentTimeMillis();
        int sum = integerList.stream()
                .parallel()
                .reduce(0, (x, y) -> x+y); //perform the unboxing from Integer to int
        long duration = System.currentTimeMillis() - start;
        System.out.println("Duration in Parallel Stream: " + duration);
        return sum;
    }

    static void main() {

        var integerList = IntStream.rangeClosed(1, 10000)
                .boxed()
                .collect(Collectors.toList());
        sequentialSum(integerList);
        parallelSum(integerList);
    }
}
