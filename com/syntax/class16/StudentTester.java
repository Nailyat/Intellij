package com.syntax.class16;

public class StudentTester {
    public static void main(String[] args) {

        Students student = new Students();
        student.name = "Nailya";
        student.age = 35;
        student.id = "123";
        student.displayFee();
        System.out.println(Students.schoolName);

        Students student1 = new Students();
        student1.name = "Talgat";
        student1.age = 34;
        student1.id = "321";
        Students.schoolName = "Syntax tech"; //reinitialized the variable
        System.out.println(Students.schoolName);


    }
}
