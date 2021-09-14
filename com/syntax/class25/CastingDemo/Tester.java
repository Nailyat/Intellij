package com.syntax.class25.CastingDemo;

public class Tester {
    public static void main(String[] args) {

        Family family=new Child1("John"); // the extra method(playGames) from Child1 class won't be called, only the parent (Family) class methods
        family.eat();
        family.sleep();
        ((Child1)family).playGames(); // now we can call all methods from child class

        /* Child1 child1=(Child1) family;
        child1.playGames();
        child1.eat();
        child1.sleep(); */


        family=new Child2("Tom");
        family.eat();
        family.sleep();
        ((Child2)family).rideOnBike();
        // Object[] object={"blabla", 123, 'A', true};
    }
}
