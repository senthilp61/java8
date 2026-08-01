package com.modernjava.streams;

import com.modernjava.data.Employee;
import com.modernjava.data.EmployeeDataBase;

import java.util.stream.Collectors;

public class StreamsInterviewQuestions {

    static void main() {

        EmployeeDataBase.getAllEmployees().stream()
                .collect(Collectors.groupingBy(Employee::department))
                .forEach((k,v) -> {
                    var averageOptional = v.stream()
                            .map(Employee::salary)
                            .mapToLong(Long::longValue)
                            .average();
                    System.out.println(""" 
                                The average Salary for the %s is %s
                                """.formatted(k, averageOptional.isPresent() ? averageOptional.getAsDouble() : 0));

                });
    }
}
