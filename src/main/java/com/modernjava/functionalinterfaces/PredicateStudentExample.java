package com.modernjava.functionalinterfaces;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = s -> s.gradeLevel() >= 3;

    static Predicate<Student> p2 = s -> s.gpa() >= 3.9;

    public static void filterStudentsByGradeLevel() {
        System.out.println("filterStudentsByGradeLevel: ");
        var students = StudentDataBase.getAllStudents();

        students.forEach(student -> {

            if(p1.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsByGPA() {
        System.out.println("filterStudentsByGPA: ");
        var students = StudentDataBase.getAllStudents();

        students.forEach(student -> {

            if(p2.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudents() {
        System.out.println("filterStudents: ");
        var students = StudentDataBase.getAllStudents();

        students.forEach(student -> {

            //if(p1.and(p2).test(student)) {
            //if(p1.or(p2).test(student)) {
            if(p1.or(p2).negate().test(student)) {
                System.out.println(student);
            }
        });
    }

    static void main() {
        filterStudentsByGradeLevel();
        filterStudentsByGPA();
        filterStudents();
    }
}
