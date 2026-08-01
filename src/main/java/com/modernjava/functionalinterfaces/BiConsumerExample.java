package com.modernjava.functionalinterfaces;

import com.modernjava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities() {

        BiConsumer<String, List<String>> biConsumer
                = (name, activites) -> System.out.println("""
                %s : %s
                """.formatted(name, activites));

        var students = StudentDataBase.getAllStudents();
        students.forEach(student -> biConsumer.accept(student.name(), student.activities()));
    }

    static void main() {

        BiConsumer<String, String> biConsumer
                = (a, b) -> System.out.println("""
                                                a : %s, b : %s
                                                """.formatted(a, b));
        biConsumer.accept("java7", "java8");

        BiConsumer<Integer, Integer> multiply
                = (a, b) -> System.out.println("""
                    Multiplication is : %s    
                    """.formatted(a*b));

        BiConsumer<Integer, Integer> division
                = (a, b) -> System.out.println("""
                    Division is : %s    
                    """.formatted(a/b));

        multiply.andThen(division).accept(10, 5);

        nameAndActivities();
    }
}
