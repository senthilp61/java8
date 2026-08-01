package com.modernjava.streams;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers) {

        return integers.stream()
                .limit(2)
                .reduce((x, y) -> x+y);
    }

    public static Optional<Integer> skip(List<Integer> integers) {

        return integers.stream()
                .skip(2)
                .reduce((x, y) -> x+y);
    }

    static void main() {

        var integers = Arrays.asList(6, 7, 8, 9, 10);
        /*var limitResult = limit(integers);
        if(limitResult.isPresent()) {
            System.out.println("The limit result is :" + limitResult.get());
        }
        else
        {
            System.out.println("No input is passed");
        }*/

        var skipResult = skip(integers);
        if(skipResult.isPresent()) {
            System.out.println("The skip result is :" + skipResult.get());
        }
        else
        {
            System.out.println("No input is passed");
        }
    }
}
