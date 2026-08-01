package com.modernjava.streams;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::name)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Set<String> namesSet() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::name)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    static void main() {

        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
