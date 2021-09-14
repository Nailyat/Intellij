package com.syntax.class22;

public class Parent {

    String name="Nailya";

    void printName(){
        System.out.println("Name is "+name);
    }
   void getMarried(){
       System.out.println(" my children will get marry by my choice");
   }

}
class Child extends Parent {
    String name="Ilyas"; //if delete this variables, "this" from syso will refer to Parent class

    void printName(){
        String name="Daulet";
        System.out.println("Name is "+name);
        System.out.println("Name is "+this.name); // this refer to local class
        System.out.println("Name is "+super.name);
    }
    void getMarried(){
        System.out.println("But I like someone else");
    }
    void letsDoSomethingElse(){
        getMarried();
        this.getMarried(); // this refer to local class
        super.getMarried();// we can have methods and field on the second line as well
    }
}
