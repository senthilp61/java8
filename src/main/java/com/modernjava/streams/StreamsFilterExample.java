package com.modernjava.streams;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {

        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.gender().equals("female"))
                .filter(s -> s.gpa() >= 3.9)
                .collect(Collectors.toList());
    }

    static void main() {

        //System.out.println("filterStudents : " + filterStudents());
        filterStudents().forEach(System.out::println);
    }
}
