package com.rajat.test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {

    private String name;
    private int marks;

    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(final int marks) {
        this.marks = marks;
    }
    public Student(final String name, final int marks) {
        super();
        this.name = name;
        this.marks = marks;
    }

}


public class TestStream {

    public static List<String> getStudentNameBasedOnMarksAndSortOnNames(final Stream<Student> students,
            final int passingScore) {

        final List<String> stName = new ArrayList<>();

        final List<Student> stdLst = students.filter(s -> s.getMarks() >= passingScore)
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
        .collect(Collectors.toList());

        for (final Student stnt : stdLst) {
            stName.add(stnt.getName());
        }
        System.out.println(stName);
        return stName;

    }


    public static List<String> getStudentNameBasedOnMarksAndSortOnMarks(final Stream<Student> students,
            final int passingScore) {

        final List<String> stName = new ArrayList<>();

        final List<Student> stdLst = students.filter(s -> s.getMarks() >= passingScore)
//                .sorted((o1, o2) -> o1.getMarks() - o2.getMarks())
                .sorted(Collections.reverseOrder((o1, o2) -> o1.getMarks() - o2.getMarks()))
        .collect(Collectors.toList());

        for (final Student stnt : stdLst) {
            stName.add(stnt.getName());
        }
        System.out.println(stName);
        return stName;

    }

    public static void main(final String[] args) {
        final List<Student> student = new ArrayList<>();
        student.add(new Student("Rajat", 40));
        student.add(new Student("Raju", 80));
        student.add(new Student("Rajiv", 60));
        student.add(new Student("Pawan", 90));
        student.add(new Student("Aditya", 65));
        student.add(new Student("Atul", 70));
        student.add(new Student("Aamir", 90));
        getStudentNameBasedOnMarksAndSortOnNames(student.stream(), 65);
        getStudentNameBasedOnMarksAndSortOnMarks(student.stream(), 65);
    }

}
