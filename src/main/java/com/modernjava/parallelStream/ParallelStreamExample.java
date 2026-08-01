package com.modernjava.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    private static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes) {

        var startTime = System.currentTimeMillis();
        for (int i = 0; i<numberOfTimes; i++) {

            supplier.get();
        }
        var endTime = System.currentTimeMillis();
        return endTime - startTime;

    }

    public static int sumSequentialStream() {

        return IntStream.rangeClosed(1, 100000)
                .sum();
    }

    public static int sumParallelStream() {

        return IntStream.rangeClosed(1, 100000)
                .parallel() // split the data into multiple parts
                .sum();
    }

    static void main() {

        System.out.println("availableProcessors: " + Runtime.getRuntime().availableProcessors());
        System.out.println("sumSequentialStream: " + checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20));
        System.out.println("sumParallelStream: " + checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20));
    }
}
