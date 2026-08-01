package com.modernjava.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    static void main() {

        IntStream intStream = IntStream.range(1, 50);
        System.out.println("Range Count " + intStream.count());

        IntStream.range(1, 50).forEach(i -> System.out.print(i+ ", "));
        System.out.println();
        System.out.println("Range Closed Count: " + IntStream.rangeClosed(1, 50).count());
        System.out.println();
        IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value +", "));
        System.out.println();
        System.out.println("LongStream Range Count: " + LongStream.range(1, 50).count());
        System.out.println();
        LongStream.range(1, 50).forEach(value -> System.out.print(value +", "));
        System.out.println();
        System.out.println("LongStream Range Closed Count: " + LongStream.rangeClosed(1, 50).count());
        System.out.println();
        LongStream.rangeClosed(1, 50).forEach(value -> System.out.print(value +", "));
        System.out.println();
        System.out.println("Double Stream: ");
        IntStream.range(1, 50).asDoubleStream().forEach(value -> System.out.print(value+", "));

    }
}
