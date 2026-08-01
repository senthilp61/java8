package com.modernjava.functionalinterfaces;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static void main() {

        Supplier<Student>  studentSupplier
                = () -> new Student("Adam", 2, 3.6, "male",
                Arrays.asList("swimming", "basketball", "volleyball"), 10);

        //Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
        Supplier<List<Student>> studentsSupplier = StudentDataBase::getAllStudents;

        System.out.println("Student is : " + studentSupplier.get());
        System.out.println("Students are : " + studentsSupplier.get());
    }
}
