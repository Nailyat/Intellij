package com.syntax.class19;

public class Person {
    String name;
    int age;
    double weight;
    double height;
    String education;

    Person () {
        System.out.println("Important lines of code that should always be executed when creating the object of this class.");
        name="Nailya";
        age=35;
        weight=50;
        height=170;
        education="Master";
    }
    Person(String personName) {
        this(); // calls the no argument constructor must be on first line
        System.out.println("1 constructor");
        name = personName;
        // other data is don't need more
        // age = 35;
        // weight = 50;
        // height = 170;
        // education = "Master";
    }

 // Constructor example 1
    Person(String personName, int personAge){
        this(personName); // calls previous constructor with same parameters
        System.out.println("1 constructor");
       // name=personName;
        age=personAge;
       // weight=50;
       // height=170;
        // education="Master";
    }
    void printInfo(){
        System.out.println("Name "+name+", age "+age+", weight "+weight+", height "+height+", education "+education);
    }

    // Constructor example 2 (Scanner)
    Person(int personAge,String personName) {
        System.out.println("2 constructor");
        name = personName;
        age = personAge;
        weight = 80;
        height = 175;
        education = "Master";
    }



}
