package com.modernjava.methodreference;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    //static Predicate<Student> p1 = s -> s.gradeLevel() >= 3;
    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s) {

        return s.gradeLevel() >= 3;
    }

    static void main() {

        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
