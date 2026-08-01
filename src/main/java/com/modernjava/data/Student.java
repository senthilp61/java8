package com.modernjava.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Student(String name,
                      int gradeLevel,
                      double gpa,
                      String gender,
                      List<String> activities,
                      int notebooks,
                      Optional<Bike> bike) {

    public Student() {
        this("Adam", 2, 3.6, "male",
                Arrays.asList("swimming", "basketball", "volleyball"), 5, Optional.empty());
    }

    public Student(String name) {
        this(name, 2, 3.6, "male",
                Arrays.asList("swimming", "basketball", "volleyball"), 6, Optional.empty());
    }

    public Student(String name,
                   int gradeLevel,
                   double gpa,
                   String gender,
                   List<String> activities,
                   int notebooks) {
        this(name, gradeLevel, gpa, gender, activities, notebooks, Optional.empty());
    }
}
