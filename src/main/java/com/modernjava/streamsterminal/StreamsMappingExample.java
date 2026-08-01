package com.modernjava.streamsterminal;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsMappingExample {
    static void main() {

        var namesList = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::name, Collectors.toList()));

        System.out.println("namesList: " + namesList);

        var namesSet = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::name, Collectors.toSet()));

        System.out.println("namesSet: " + namesSet);

        /*StudentDataBase.getAllStudents().stream()
                .map(Student::name)
                .collect(Collectors.toSet());*/
    }

}
