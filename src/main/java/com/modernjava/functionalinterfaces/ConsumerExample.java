package com.modernjava.functionalinterfaces;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = s -> System.out.println(s);
    static Consumer<Student> c3 = s -> System.out.print(s.name());
    static Consumer<Student> c4 = s -> System.out.println(s.activities());

    public static void printStudents() {

        var students = StudentDataBase.getAllStudents();
        students.forEach(c2);
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities:");
        var students = StudentDataBase.getAllStudents();
        students.forEach(c3.andThen(c4)); //consumer chaining

    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("printNameAndActivitiesUsingCondition:");
        var students = StudentDataBase.getAllStudents();
        students.forEach(s -> {
            if(s.gradeLevel() >= 3 && s.gpa() >= 3.9) {
                c3.andThen(c4).accept(s);
            }
        });

    }

    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());

        c1.accept("java 8");
        printStudents();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
