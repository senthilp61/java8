package com.modernjava.constructorreference;

import com.modernjava.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSupplier = Student::new;

    static Function<String, Student> studentFunction = Student::new;

    static void main() {

        System.out.println(studentSupplier.get());
        System.out.println(studentFunction.apply("Senthil Prakash P"));
    }
}
