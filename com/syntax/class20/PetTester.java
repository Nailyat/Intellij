package com.syntax.class20;

public class PetTester {
    public static void main(String[] args) {

        Cat cat=new Cat();
        cat.name="Tom";
        cat.meow();
        cat.eat();

        Dog dog = new Dog();
        dog.name="Bingo";
        dog.eat();
        dog.bark();
    }
}
