package com.syntax.class16;

public class Cat {

    static int noOfLegs=4;
    String name;
    static void display(){
        System.out.println(noOfLegs);
       // System.out.println(name); instance variables can't be used inside a static method!!!
    }
    void display2(){
        System.out.println(noOfLegs); // static variables easily can be use in non-static method
        System.out.println(name);

    }



}
