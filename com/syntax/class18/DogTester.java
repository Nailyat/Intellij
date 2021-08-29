package com.syntax.class18;

public class DogTester {
    public static void main (String [] args){
        Dog dog1=new Dog("Bingo",2,25, 40,"Husky","white");
        dog1.printDogInfo();

        Dog dog2=new Dog("Bobby");
        dog2.printDogInfo();

        Dog dog3=new Dog("Jimmy", 5);
        dog3.printDogInfo();

        Dog dog4=new Dog();
        dog4.printDogInfo();

    }
}
