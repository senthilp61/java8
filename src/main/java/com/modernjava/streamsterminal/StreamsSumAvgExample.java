package com.modernjava.streamsterminal;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    public static int sum() {

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::notebooks));
    }

    public static double average() {

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::notebooks));
    }

    static void main() {

        System.out.println("Total No of notebooks: " + sum());
        System.out.println("Average No of notebooks: " + average());
    }
}
