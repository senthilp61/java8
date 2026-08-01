package com.modernjava.streams;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortedStudentsByName() {

        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::name))
                .collect(Collectors.toList());
    }

    public static List<Student> sortedStudentsByGPA() {

        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::gpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortedStudentsByGPADesc() {

        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::gpa).reversed())
                .collect(Collectors.toList());
    }

    static void main() {

        System.out.println("Students sorted by Name: ");
        sortedStudentsByName().forEach(System.out::println);

        System.out.println("Students sorted by GPA: ");
        sortedStudentsByGPA().forEach(System.out::println);

        System.out.println("Students sorted by GPA DESC: ");
        sortedStudentsByGPADesc().forEach(System.out::println);
    }
}
