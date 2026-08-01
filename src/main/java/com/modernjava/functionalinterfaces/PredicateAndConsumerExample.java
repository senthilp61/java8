package com.modernjava.functionalinterfaces;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = s -> s.gradeLevel() >= 3;
    Predicate<Student> p2 = s -> s.gpa() >= 3.9;

    BiPredicate<Integer, Double> biPredicate
            = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> studentBiConsumer
            = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = s -> {

        //if(p1.and(p2).test(s)) {
        if(biPredicate.test(s.gradeLevel(), s.gpa())) {
                studentBiConsumer.accept(s.name(), s.activities());
        }
    };

    public void printNameAndActivities(List<Student> students) {

        students.forEach(studentConsumer);
    }

    static void main() {
        var students = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(students);
    }
}
