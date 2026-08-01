package com.modernjava.streams;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int noOfNotebooks() {

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.gradeLevel() >= 3)
                .filter(student -> student.gender().equals("female"))
                .map(Student::notebooks)
                //.reduce(0, (n1, n2) -> n1+n2);
                .reduce(0, Integer::sum);
    }

    static void main() {

        System.out.println("noOfNotebooks: " + noOfNotebooks());
    }
}
