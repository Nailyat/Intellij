package com.syntax.class20;

public class Pet {
    String name;
    int age;
    double height;
    double weight;

    void eat(){
        System.out.println("I can eat");
    }
    void meow(){
        System.out.println("Cat "+name+" can meow all day");
    }
    void bark(){
        System.out.println("Dog "+name+" barks at night");
    }

}
