package com.syntax.review.class09;

public class Human {

    String name;
    int age;
    double height;
    double weight;

    Human(){
        System.out.println("Testing the constructor #1");
        name="Nailya";
        age=35;
        height=168;
        weight=55;
    }

    Human(String humanName){
        this();
        System.out.println("Testing the constructor #2");
        name=humanName;
    }

    Human(String humanName, int humanAge){
        this(humanName);
        System.out.println("Testing the constructor #3");
        age=humanAge;

    }

    void printHumanInfo(){
        System.out.println(name+" "+age+" "+height+" "+weight);
    }
}
