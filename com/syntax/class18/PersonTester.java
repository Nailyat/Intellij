package com.syntax.class18;

public class PersonTester {
    public static void main (String [] args){
        Person person=new Person("Nailya", 35, "USA");
       /* person.name="Nailya";
        person.age=35;
        person.country="USA";*/
        person.printInfo();

        Person person1=new Person("Talgat", 34, "USA");
       /* person1.name="Talgat";
        person1.age=34;
        person1.country="USA";*/
        person1.printInfo();

    }
}
