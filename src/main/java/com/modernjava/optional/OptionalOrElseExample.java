package com.modernjava.optional;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //orElse
    public static String optionalOrElse() {

        Optional<Student> studentOptional
                    = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        /*Optional<Student> studentOptional
                = Optional.ofNullable(null); //Option.empty*/
        String name = studentOptional.map(Student::name).orElse("Default");
        return name;
    }
    //orElseGet
    public static String optionalOrElseGet() {
        /*Optional<Student> studentOptional
                = Optional.ofNullable(StudentDataBase.studentSupplier.get());*/
        Optional<Student> studentOptional
                = Optional.ofNullable(null);
        var name = studentOptional.map(Student::name).orElseGet(() -> "Default");
        return name;

    }

    //orElseThrow
    public static String optionalOrElseThrow() {

        /*Optional<Student> studentOptional
                =  Optional.ofNullable(StudentDataBase.studentSupplier.get());*/
        Optional<Student> studentOptional
                =  Optional.ofNullable(null);
        var name = studentOptional.map(Student::name).orElseThrow(() -> new RuntimeException("No Data Available"));

        return name;
    }

    static void main() {

        System.out.println("orElseGet: " + optionalOrElse());
        System.out.println("orElseGet: " + optionalOrElseGet());
        System.out.println("orElseThrow: " + optionalOrElseThrow());
    }
}
