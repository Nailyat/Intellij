package com.syntax.class27.Encapsulation;

public class PersonTester {
    public static void main(String[] args) {

        Person person=new Person();
        person.setName("Nailya");
        person.setAge(35);
        person.setWeight(55);
        /* person.name="Nailya";
        person.age=35;
        person.weight=55;
        person.height=168; */

        person.printInfo();

        Person person1=new Person();

        /* person.name="Talgat";
        person.age=34;
        person.weight=85;
        person.height=175; */

       // person.printInfo();


    }
}
