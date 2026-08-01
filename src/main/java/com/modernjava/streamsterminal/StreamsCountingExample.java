package com.modernjava.streamsterminal;

import com.modernjava.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

    public static long count() {

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.gpa() >= 3.9)
                .collect(Collectors.counting());
    }

    static void main() {
        System.out.println("count :"+ count());
    }
}
