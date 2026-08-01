package com.modernjava.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1 = i -> i%2==0;

    static Predicate<Integer> p2 = i -> i%5==0;

    private static void predicateAnd() {
        System.out.println("Predicate And result is : " + p1.and(p2).test(10)); //predicate chaining
        System.out.println("Predicate And result is : " + p1.and(p2).test(9));  //predicate chaining
    }

    private static void predicateOr() {
        System.out.println("Predicate Or result is : " + p1.or(p2).test(10)); //predicate chaining
        System.out.println("Predicate Or result is : " + p1.or(p2).test(8));  //predicate chaining
    }

    private static void predicateNegate() {
        System.out.println("Predicate Negate result is : " + p1.or(p2).negate().test(8)); //predicate chaining

    }

    static void main() {

        System.out.println(p1.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

}
