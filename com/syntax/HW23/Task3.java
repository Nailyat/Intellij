package com.syntax.HW23;

public class Task3 {

    // Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    static void sayHello(){
        System.out.println("Hi");
    }
    static void sayHello(String name){
        System.out.println("Hi "+name);
    }
    static void sayHello(String name, int times){
        for (int i=0; i<times; i++){
            System.out.println("Hi "+name);
        }
    }

    public static void main(String[] args) {

        sayHello("Nailya", 3);
    }
}
