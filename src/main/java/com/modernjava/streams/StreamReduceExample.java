package com.modernjava.streams;

import com.modernjava.data.Student;
import com.modernjava.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList) {

        return integerList.stream()
                .reduce(1,(a,b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {

        return integerList.stream()
                .reduce((a,b) -> a*b);
    }

    public static Optional<Student> getHighestGPAStudent() {

        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> s1.gpa() > s2.gpa() ? s1 : s2
                /*{
                    if(s1.gpa() > s2.gpa()) {
                        return s1;
                    }
                    else {
                        return s2;
                    }
                }*/
                );
    }

    static void main() {

        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        List<Integer> integers1 = new ArrayList<>();

        System.out.println(performMultiplication(integers));

        var result = performMultiplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        var result1 = performMultiplicationWithoutIdentity(integers1);
        System.out.println(result1.isPresent());

        if(result1.isPresent()) {

            System.out.println(result1.get());
        }

        var studentOptional = getHighestGPAStudent();
        if(studentOptional.isPresent()) {
            System.out.println(studentOptional.get());
        }
     }
}
