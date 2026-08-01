package com.modernjava.data;

public record Employee(String name,
                       String department,
                       Integer age,
                       Gender gender,
                       Long salary) {
}
