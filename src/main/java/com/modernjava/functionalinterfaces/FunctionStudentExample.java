package com.modernjava.functionalinterfaces;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction
            = students -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(s -> {
            if(PredicateStudentExample.p1.test(s)){
                studentGradeMap.put(s.name(),s.gpa());
            }
        });
        return studentGradeMap;
    };

    static void main() {

        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
