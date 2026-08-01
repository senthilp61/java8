package com.modernjava.defaults;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    /*static Consumer<Student> studentConsumer
            = student -> System.out.println(student);*/

    static Consumer<Student> studentConsumer
            = System.out::println;

    static Comparator<Student> nameComparator
            = Comparator.comparing(Student::name);

    static Comparator<Student> gradeComparator
            = Comparator.comparing(Student::gradeLevel);

    public static void sortByName(List<Student> studentList) {

        System.out.println("After sortByName: ");


        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGPA(List<Student> studentList) {

        System.out.println("After sortByGPA: ");
        Comparator<Student> gpaComparator
                = Comparator.comparingDouble(Student::gpa);

        studentList.sort(gpaComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList) {

        System.out.println("After comparatorChaining");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList) {

        System.out.println("After sortWithNullValues: ");
        var studentComparator
                = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    static void main() {

        var studentList = StudentDataBase.getAllStudents();
        System.out.println("Before Sort: ");
        studentList.forEach(studentConsumer);
        //sortByName(studentList);
        //sortByGPA(studentList);
        //comparatorChaining(studentList);
        sortWithNullValues(studentList);

    }
}
