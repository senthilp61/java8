package com.modernjava.optional;

import java.util.Optional;

public class OptionalPresentExample {

    static void main() {
        //isPresent
        var optional = Optional.ofNullable("hello Optional");
        /*var optional = Optional.ofNullable(null);*/
        System.out.println(optional.isPresent());
        if(optional.isPresent()) {
            System.out.println(optional.get());
        }
        //ifPresent
        //optional.ifPresent(s -> System.out.println(s));
        optional.ifPresent(System.out::println);
    }
}
