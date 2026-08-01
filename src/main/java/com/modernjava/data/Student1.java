package com.modernjava.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student1 {

    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private List<String> activities = new ArrayList<>();

    public void printListOfActivities() {
        System.out.println(activities);
    }
}
