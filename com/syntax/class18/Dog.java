package com.syntax.class18;

public class Dog {
    String name;
    int age;
    double height;
    double weight;
    String breed;
    String color;
    static int noOfLegs=4;

    // Constructor 1
    Dog(String dogName, int dogAge, double dogHeight, double dogWeight, String dogBreed, String dogColor){
        name=dogName;
        age=dogAge;
        height=dogHeight;
        weight=dogWeight;
        breed=dogBreed;
        color=dogColor;
    }
    // Constructor 2
    Dog(String dogName){
        name=dogName;
        age=3;
        height=28;
        weight=50;
        breed="Husky";
        color="Ginger";
    }
    Dog(String dogName, int dogAge){
        name=dogName;
        age=dogAge;
        height=28;
        weight=50;
        breed="Husky";
        color="Ginger";
    }
    Dog(){
        name="Jimmy";
        age=6;
        height=43;
        weight=50;
        breed="Husky";
        color="Ginger";
    }
    void printDogInfo(){
        System.out.println("Name "+name+", age "+age+", height "+height+", weight "+weight+", breed "+breed+", color "+color);
    }
}
