package com.modernjava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value = 4;

    static void main() {

        //int value = 4; //local variable

        Consumer<Integer> c1 = i -> {
            value++;
            System.out.println(value+i);
        };

        //value = 6;

        c1.accept(4);
    }
}
