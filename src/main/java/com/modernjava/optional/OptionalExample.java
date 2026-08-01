package com.modernjava.optional;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {

        //var student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student != null) {
            return student.name();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptional() {

        //var student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        if(student.isPresent()) {
            student.get(); //Student
            return student.map(Student::name);  //Optional<String>
        }
        return Optional.empty();
    }

    static void main() {
        /*String name = getStudentName();
        if(name != null)
            System.out.println("Length of the student Name: " + name.length());
        else
            System.out.println("Name not found");*/

        var stringOptional = getStudentNameOptional();

        if(stringOptional.isPresent()) {
            System.out.println("Length of the Student Name: " + stringOptional.get().length()); //String which is Student Name
        }
        else {
            System.out.println("Name not found");
        }
    }
}
