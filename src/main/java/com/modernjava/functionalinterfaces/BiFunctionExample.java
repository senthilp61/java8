package com.modernjava.functionalinterfaces;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction
            = (students, studentPredicate) -> {

        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student)) {
                studentGradeMap.put(student.name(), student.gpa());
            }
        });
        return studentGradeMap;
    };

    static void main() {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p2));
    }
}
