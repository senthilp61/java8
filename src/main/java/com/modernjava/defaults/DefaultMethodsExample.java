package com.modernjava.defaults;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DefaultMethodsExample {

    static void main() {

        /**
         * Sort the list of names in alphabetical order
         */

        var stringList
                = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");

        /**
         * Prior to Java 8
         */

        /*Collections.sort(stringList);
        System.out.println("Sorted list using Collections.sort() : " + stringList);*/

        /**
         * Java 8
         */

        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using List.sort(): " + stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted list using List.sort() reverse: " + stringList);
    }
}
