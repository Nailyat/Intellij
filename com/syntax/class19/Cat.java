package com.syntax.class19;

public class Cat {

    String name;
    int age;
    double height;
    double weight;

    Cat(String name, int age, double height, double weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    void printInfo(){
        String name="Myavka"; // if we need to change some variable
        System.out.println("Name "+name+", age "+age+", height "+height+", weight "+weight);
    }

}
