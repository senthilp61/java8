package com.modernjava.streams;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent() {

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.gpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.gpa() >= 3.9)
                .findFirst();
    }

    static void main() {

        var studentOptional = findAnyStudent();
        if(studentOptional.isPresent()) {
            System.out.println("findAnyStudent : " + studentOptional.get());
        }
        else
        {
            System.out.println("Student not found");
        }

        var studentOptional1 = findFirstStudent();
        if(studentOptional1.isPresent()) {
            System.out.println("findFirstStudent : " + studentOptional1.get());
        }
    }
}
