package com.syntax.class25.TaskStudent;

public class StudentTester {
    public static void main(String[] args) {

        Student student=new Student(); // executed from class Student
        student.study();
        student.doHomeWork();
        student.practice();

        Student student1=new SyntaxStudent();
        student1.study();
        student1.doHomeWork();
        student1.practice();
    }
}
