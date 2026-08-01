package com.modernjava.streams;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;
import com.modernjava.functionalinterfaces.PredicateStudentExample;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static void main() {

        // student name and there activities in a map
        Predicate<Student> studentPredicate
                = student -> student.gradeLevel() >= 3;

        Predicate<Student> studentGPAPredicate
                = student -> student.gpa() >= 3.9;

        var studentMap = StudentDataBase.getAllStudents().stream()
                //StudentDataBase.getAllStudents().parallelStream()
                        .peek(System.out::println)
                        //.filter(student -> student.gradeLevel() >= 3)
                        .filter(studentPredicate) //Stream<Student>
                        .peek(s -> System.out.println("after 1st filter : " + s))
                        .filter(studentGPAPredicate)
                        .peek(s -> System.out.println("after 2nd filter : " + s))
                .collect(Collectors.toMap(Student::name, Student::activities)); //Map<String, List<String>>

        System.out.println(studentMap);
    }
}
