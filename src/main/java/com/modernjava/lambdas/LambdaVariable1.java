package com.modernjava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    static void main() {

        int i = 0;

        Consumer<Integer> c1 = i1 -> System.out.println("Value is : "+ i1);
    }
}
