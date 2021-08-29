package com.syntax.class20;

public class Car {
    String model;
    String make;
    int year;
    Car(){
        System.out.println("Empty constructor with zero parameters");
    }
    Car(String model){
        this();
        this.model=model;
        this.make="none";
        this.year=0;
        System.out.println("Constructor with 1 parameters");
    }
    Car(String model, String make){
        this(model);
        this.make=make;
        this.year=0;
        System.out.println("Constructor with 2 parameters");
    }
    Car(String make, String model, int year) {
        // this.model=model;
        // this.make=make;
        this(model, make);
        this.year = year;
        System.out.println("Constructor with 3 parameters");
    }
    void printInfo(){
        String lexusMake="Lexus";
        String model="RX350L";
        int year=2021;
        System.out.println(make+" "+model+" "+year);
    }
}
