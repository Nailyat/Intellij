package com.syntax.HW18;

public class Task1 {
    // TASK 1
    // Write a program that will have a constructor:
    // one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.


    String address;

    // Constructor w/o parameters
    Task1(){
        System.out.println("No argument constructor");
    }

    // Constructor with parameters
    Task1(String address) {
        System.out.println("Argument constructor");
        this.address=address;

    }
}
