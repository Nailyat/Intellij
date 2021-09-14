package com.syntax.class25.TaskStudent;

public class Student {

    /* Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
       Define common behavior within parent class and override some of the methods in child classes
       Define some methods specific to child classes
       Write example of achieving run time polymorphism */

    void study(){
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("Students must do home work");
    }
    void practice() {
        System.out.println("Students must practice");
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax Students must study hard to get a job quickly");
    }
    void doHomeWork(){
        System.out.println("Syntax Students must do programming home work");
    }
    void doResearch(){
        System.out.println("Syntax Students must do research and watch videos");
    }
}
class Collegestudent extends Student{

    void doHomeWork(){
        System.out.println("College Students must do homeworks to get a good grades");
    }
}
class SchoolStudent extends Student{

}