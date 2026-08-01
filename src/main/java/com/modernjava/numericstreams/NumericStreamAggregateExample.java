package com.modernjava.numericstreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    static void main() {

        var sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println("Sum is : "+sum);

        var optionalInt = IntStream.rangeClosed(1, 50).max();
        System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : 0);

        System.out.println(IntStream.rangeClosed(0, 0).count());

        var optionalLong = LongStream.rangeClosed(50, 100).min();
        System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : 0);

        var optionalDouble = IntStream.rangeClosed(1, 50).average();
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0);

    }
}
