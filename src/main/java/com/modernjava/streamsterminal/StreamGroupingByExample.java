package com.modernjava.streamsterminal;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingByExample {

    public static Map<String, List<Student>> groupingByStudentsByGender() {

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::gender));
    }

    public static Map<String, List<Student>> customizedGroupingBy() {

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.gpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
    }

    public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping() {

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::gradeLevel,
                        Collectors.groupingBy(student -> student.gpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
    }

    public static Map<Integer, Integer> twoLevelGrouping2() {

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::gradeLevel,
                        Collectors.summingInt(Student::notebooks)));
    }

    public static Map<String, Integer> twoLevelGrouping3() {

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::name,
                        Collectors.summingInt(Student::notebooks)));
    }

    public static Map<String, Set<Student>> threeArgumentGroupBy() {

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::name, LinkedHashMap::new, Collectors.toSet()));
    }

    public static Map<Integer, Optional<Student>> studentMapOptional() {

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::gradeLevel,
                                               Collectors.maxBy(Comparator.comparing(Student::gpa))));
    }

    public static Map<Integer, Student> calculateTopGPA() {

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::gradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::gpa)), Optional::get)
                        ));
    }

    public static Map<Integer, Student> calculateLeastGPA() {

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::gradeLevel,
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::gpa)), Optional::get)
                ));
    }

    static void main() {

        //System.out.println(groupingByStudentsByGender());
        //System.out.println(customizedGroupingBy());
        //System.out.println(twoLevelGrouping());
        //System.out.println("twoLevelGrouping2: " + twoLevelGrouping2());
        //System.out.println("twoLevelGrouping3: " + twoLevelGrouping3());
        //System.out.println("threeArgumentGroupBy: " + threeArgumentGroupBy());
        //System.out.println("studentMapOptional: " + studentMapOptional());
        System.out.println("studentMapOptional1: " + calculateTopGPA());
        System.out.println("calculateLeastGPA: " + calculateLeastGPA());
    }
}
