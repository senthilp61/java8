package com.modernjava.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class EmployeeDataBase {

    public static Supplier<Employee> employeeSupplier
            = () -> new Employee("Senthil Prakash P", "development",36, Gender.MALE, 10000L);

    public static List<Employee> getAllEmployees() {

        var employee1 = new Employee("Senthil Prakash P", "Development", 36, Gender.MALE, 10000L);
        var employee2 = new Employee("Krishna Prasath P", "Business Analyst",34, Gender.MALE, 100000L);
        var employee3 = new Employee("Varunya L", "Human Resource",30, Gender.FEMALE, 1000000L);
        var employee4 = new Employee("Devi Visalatchi P", "Human Resource", 41, Gender.FEMALE, 1000L);
        var employee5 = new Employee("Sajin Narayanan ", "Development", 45, Gender.MALE, 1000L);
        var employee6 = new Employee("Vaishnav S", "Development", 9, Gender.MALE, 100L);
        var employee7 = new Employee("Sajeev S", "Business Analyst", 7, Gender.MALE, 100L);


        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6, employee7);

        return employees;
    }
}
