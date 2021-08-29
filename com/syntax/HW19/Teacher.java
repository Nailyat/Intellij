package com.syntax.HW19;

public class Teacher {

    // Task3
    // Write a Java program called Teacher.
    // Identify features and behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    // Test all 4 classes

    static String school="Synrax";
    String name;
    int age;
    String books;
    double salary;

    void teach(){
        System.out.println(name+" teaches "+books);
    }
}
