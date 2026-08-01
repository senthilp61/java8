package com.modernjava.streamsterminal;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartitioningByExample {

    public static Map<Boolean, List<Student>> partitioningBy() {

        Predicate<Student> gpaPredicate = student -> student.gpa() >= 3.8;
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate));

    }

    public static Map<Boolean, Set<Student>> partitioningBy1() {

        Predicate<Student> gpaPredicate = student -> student.gpa() >= 3.8;
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate, Collectors.toSet()));

    }

    static void main() {

        //System.out.println("partitioningBy: " + partitioningBy());
        System.out.println("partitioningBy1: " + partitioningBy1());
    }
}
