package com.syntax.class16;

public class Dog {


    String name; // instance variables (inside the class)
    static String breed; // static variable allows share the data between the objects
    static int noOfLegs = 4;
    String color;

    void bark() {
        int times = 10; //local variable (inside the method)
        for (int i = 0; i < times; i++) {

            System.out.println("Dog can bark");
        }
    }
}
