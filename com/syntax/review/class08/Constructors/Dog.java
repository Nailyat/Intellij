package com.syntax.review.class08.Constructors;

public class Dog {

    String name;
    int age;
    double height;
    double weight;

    //creating overloding constructors

    public Dog(){
        System.out.println("This code will be executed automatically when you create an object of this class");
    }
    public Dog (String name){
        this(); // avoiding repetition of arguments and syso
        this.name=name;
       /*  System.out.println("This code will be executed automatically when you create an object of this class"); */
        System.out.println("Constructor with 1 argument");
    }
    public Dog (String name, int age){
        /* this.name=name; */
        this(name); // avoiding repetition
        this.age=age;
        /* System.out.println("This code will be executed automatically when you create an object of this class"); */
        System.out.println("Constructor with 2 arguments");
    }
    public Dog (String name, int age, double height){
        /*this.name=name;
        this.age=age;
        */
        this(name, age);// avoiding repetition
        this.height=height;
        /* System.out.println("This code will be executed automatically when you create an object of this class"); */
        System.out.println("Constructor with 3 arguments");
    }

    public Dog(String name, int age, double height, double weight) {
        /*this.name = name;
        this.age = age;
        this.height = height;
        */
        this(name, age, height); // avoiding repetition
        this.weight = weight;
        /*System.out.println("This code will be executed automatically when you create an object of this class"); */
        System.out.println("Constructor with 4 arguments");


    }

    public static void main(String[] args) {

        Dog dog=new Dog("Tommy", 2, 50, 30);
        //Dog dog1=new Dog();
    }
}
