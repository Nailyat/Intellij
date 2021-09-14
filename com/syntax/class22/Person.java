package com.syntax.class22;

public class Person {

    String name;
    int age;
    double height;
    double weight;
    String address;
    String phoneNo;

    public Person(String name, int age, double height, double weight, String address, String phoneNo){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.address=address;
        this.phoneNo=phoneNo;
    }

    void printInfo(){
        System.out.println(name+" "+age+" "+height+" "+weight+" "+address+" "+phoneNo);
    }



}
