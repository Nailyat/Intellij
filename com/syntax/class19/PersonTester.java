package com.syntax.class19;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person("Nailya",35);
        person.printInfo();

        Scanner scanner=new Scanner(System.in);
        Person person1=new Person(scanner.nextInt(), scanner.next());
        person1.printInfo();











    }
}
