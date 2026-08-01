package com.modernjava.streams;

import com.modernjava.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch() {

        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.gpa() >= 3.9);
    }

    public static boolean anyMatch() {

        return StudentDataBase.getAllStudents().stream()
                .anyMatch((student -> student.gpa() >= 3.9));
    }

    public static boolean noneMatch() {

        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.gpa() >= 4.1);
    }

    static void main() {

        System.out.println("Result of All Match : " +allMatch());
        System.out.println("Result of Any Match : " +anyMatch());
        System.out.println("Result of None Match : " +noneMatch());
    }
}
