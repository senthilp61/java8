package com.modernjava.functionalinterfaces;

public class FunctionExample1 {

    public static String performConcat(String str) {

        return FunctionExample.addSomeString.apply(str);
    }

    static void main() {
        var result = performConcat("Hello");
        System.out.println("Result : " + result);
    }
}
