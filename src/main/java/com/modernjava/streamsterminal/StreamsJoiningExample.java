package com.modernjava.streamsterminal;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joining() {

        return StudentDataBase.getAllStudents().stream()
                .map(Student::name)
                .collect(Collectors.joining());
    }

    public static String joining2() {

        return StudentDataBase.getAllStudents().stream()
                .map(Student::name)
                .collect(Collectors.joining("-"));
    }

    public static String joining3() {

        return StudentDataBase.getAllStudents().stream()
                .map(Student::name)
                .collect(Collectors.joining("-", "(", ")"));
    }

    static void main() {

        System.out.println("joining: " + joining());
        System.out.println("joining2: " + joining2());
        System.out.println("joining3: " + joining3());
    }
}
