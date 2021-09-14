package com.syntax.class26;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal=new Cat(); // class Cat behaving like parent class Animal
        Animal animal1=new Dog();

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal; //now class Cat has own behaviour
            ((Cat) animal).meow(); // shorthand convert
        }
    }
}
