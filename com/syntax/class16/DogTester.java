package com.syntax.class16;

public class DogTester {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Bingo";
        dog.color = "Ginger";
        Dog.breed = "Huskey"; //use class name where the variable is

        Dog dog2 = new Dog();
        dog2.name = "Bobby";
        dog2.color = "Grey";
        System.out.println(dog2.name);
        System.out.println(Dog.breed); //static variable allows access one object in other to get the data of variable

    }
}
