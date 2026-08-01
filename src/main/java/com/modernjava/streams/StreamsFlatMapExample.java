package com.modernjava.streams;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {

        return StudentDataBase.getAllStudents().stream()
                .map(Student::activities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

    }

    public static long getStudentActivitiesCount() {

        return StudentDataBase.getAllStudents().stream()
                .map(Student::activities)
                .flatMap(List::stream)
                .distinct()
                .count();

    }

    static void main() {

        System.out.println("printStudentActivities : " +printStudentActivities());
        System.out.println("getStudentActivitiesCount : " +getStudentActivitiesCount());
    }
}
