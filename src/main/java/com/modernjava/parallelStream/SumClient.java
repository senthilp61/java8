package com.modernjava.parallelStream;

import java.util.stream.IntStream;

public class SumClient {

    static void main() {
        Sum sum = new Sum();

        IntStream.rangeClosed(1, 1000)
                .parallel()
                .forEach(sum::performSum);  //500500

        System.out.println(sum.getTotal());
    }
}
