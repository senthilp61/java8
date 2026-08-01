package com.modernjava.methodreference;

import com.modernjava.data.Student;
import com.modernjava.data.Student1;
import com.modernjava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    //static Consumer<Student> c1 = p -> System.out.println(p);
    static Consumer<Student1> c1 = System.out::println;

    /**
     * Classname::instanceMethodName
     */
    static Consumer<Student1> c2 = Student1::printListOfActivities;

    static void main() {
        StudentDataBase.getAllStudent1s().forEach(c1);
        StudentDataBase.getAllStudent1s().forEach(c2);
    }
}
