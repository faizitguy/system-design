package com.objects;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    void addCourse(Course course) {
        enrolledCourses.add(course);
    }

    void displayDetails() {
        System.out.println("com.objects.Student name is: " + name);
        System.out.println("com.objects.Student Enrolled Courses are: ");
        for(Course course: enrolledCourses) {
            String details = " course is " + course.getCourseName()  + " credits are " + course.getCredits();
            System.out.println(details);
        }
    }

    public static void main(String[] args) {
        Student faiz = new Student("faiz");
        faiz.addCourse(new Course("Machine Learning", 4));
        faiz.addCourse(new Course("AI", 5));
        faiz.addCourse(new Course("Java", 4));

        faiz.displayDetails();
    }

}
