package com.modernjava.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable() {

        //return Optional.ofNullable("Hello");
        return Optional.ofNullable(null);
    }

    public static Optional<String> of() {

        //return Optional.of(null);     // throws NullPointerException
        return Optional.of("Hello");
    }

    public static Optional<String> empty() {

        return Optional.empty();
    }

    static void main() {

        //System.out.println("ofNullable: " + ofNullable().get());
        System.out.println("ofNullable: " + ofNullable());
        System.out.println("of: " + of());
        System.out.println("empty: " +empty());
    }
}
