package com.modernjava.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    static void main() {

        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList
                = Arrays.asList(1, 3, 5);

        System.out.println("Result is: " + multiplier.multiply(integerList));
        System.out.println("Size of the list is: " + multiplier.size(integerList));
        System.out.println("static method isEmpty is : " + Multiplier.isEmpty(integerList));
    }
}
