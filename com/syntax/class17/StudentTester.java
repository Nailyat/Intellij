package com.syntax.class17;

public class StudentTester {
    public static void main(String[] args) {

        Student student=new Student();
        student.studentId="1";
        student.studentName="Nailya";
        Student.numberOfStudents++;

        Student student1=new Student();
        student1.studentId="2";
        student1.studentName="Talgat";
        Student.numberOfStudents++;

        Student student2=new Student();
        student2.studentId="3";
        student2.studentName="Daulet";
        Student.numberOfStudents++;

        System.out.println(Student.numberOfStudents);













    }
}
