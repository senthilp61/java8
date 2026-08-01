package com.modernjava.parallelStream;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities() {

        long startTime = System.currentTimeMillis();
        var studentActivities =  StudentDataBase.getAllStudents().stream()
                .map(Student::activities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for sequentialPrintStudentActivities: "+ (endTime - startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities() {
        long startTime = System.currentTimeMillis();
        var studentActivities = StudentDataBase.getAllStudents()
                //.stream()
                //.parallel()
                .parallelStream()
                .map(Student::activities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Time take for parallelPrintStudentActivities: " +(endTime - startTime));
        return studentActivities;
    }

    static void main() {

        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
