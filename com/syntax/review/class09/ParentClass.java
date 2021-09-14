package com.syntax.review.class09;

public class ParentClass {

    String name;
    int age;
    String hobby;

    void smile(){
        System.out.println("Always make your parents smile");
    }
}
class ChildClass extends ParentClass{

    double weight;
    double height;

    void play(){
        System.out.println("Every child likes to play");
    }
}
class GrandChild extends ChildClass{

    String color;

    void behavior(){
        System.out.println("This child is very yang");
    }
}