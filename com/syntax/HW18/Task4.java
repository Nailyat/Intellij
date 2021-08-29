package com.syntax.HW18;

public class Task4 {
    // Write a Student class that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given student using displayInfo method.

    String name;
    String address;
    Task4(String name){
        this.name=name;
        System.out.println("Constructor 1");
    }
    Task4(String name, String address) {
        this(name);
        this.address = address;
        System.out.println("Constructor 2");
    }
    void displayInfo(){
        System.out.println("Name "+name+", address "+address);
    }

}
