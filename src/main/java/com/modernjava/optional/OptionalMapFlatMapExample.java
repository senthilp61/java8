package com.modernjava.optional;

import com.modernjava.data.Bike;
import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class OptionalMapFlatMapExample {

    //filter
    public static void optionalFilter() {

        var studentOptional
            = Optional.ofNullable(StudentDataBase.studentSupplier.get());   //Optional<Student>
        studentOptional.filter(student -> student.gpa() >= 3.5)
                //.ifPresent(student -> System.out.println(student))
                .ifPresent(System.out::println);
    }

    //map
    public static void optionalMap() {

        var studentOptional
            = Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>

        if(studentOptional.isPresent()) {
            var stringOptional
                    = studentOptional
                                .filter(student -> student.gpa() >= 3.5)
                                .map(Student::name);
            System.out.println(stringOptional.get());
        }
    }

    //flatmap
    public static void optionalFlatMap() {

        var studentOptional
                = Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>
        if(studentOptional.isPresent()) {
            var name = studentOptional
                    .filter(student -> student.gpa() >= 3.5)
                    .flatMap(Student::bike)
                    .map(Bike::name);
            name.ifPresent(s -> System.out.println("name : " + s));
        }
    }

    static void main() {

        optionalFilter();
        optionalMap();
    }
}
