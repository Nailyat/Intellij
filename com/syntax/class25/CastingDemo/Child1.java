package com.syntax.class25.CastingDemo;

public class Child1 extends Family {

    Child1(String name) {
        super(name);
    }

    void sleep() {
        System.out.println(name + " likes to sleep 10 hours");
    }

    void eat() {
        System.out.println(name + " likes to eat a ice cream");
    }

    void playGames() {
     System.out.println(name+" can play games on computer");
}
}
