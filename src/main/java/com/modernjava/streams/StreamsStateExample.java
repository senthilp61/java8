package com.modernjava.streams;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsStateExample {

    public static List<String> namesUpperCase(List<Student> names) {

        return names.stream()                                   //Stream Pipeline
                .map(Student::name) //Stream State              //Stream Pipeline
                .map(String::toUpperCase) //Stream State        //Stream Pipeline
                .collect(Collectors.toList());                  //Stream Pipeline
    }

    public static List<String> printUniqueStudentActivities() {

        return StudentDataBase.getAllStudents().stream()
                .map(Student::activities)
                .flatMap(List::stream)
                .distinct() //needs the state of previously processed elements
                .sorted()   //needs the state of previously processed elements
                .collect(Collectors.toList());
    }

    static void main() {

        var names = namesUpperCase(StudentDataBase.getAllStudents());
        System.out.println("namesUpperCase :" + names);

        System.out.println("printUniqueStudentActivities: " + printUniqueStudentActivities());
    }
}
