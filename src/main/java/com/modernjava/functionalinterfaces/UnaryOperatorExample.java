package com.modernjava.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = s -> s.concat("default");

    static void main() {
        System.out.println(unaryOperator.apply("java8"));
    }
}
