package com.syntax.class25.CastingDemo;

public class Child2 extends Family {
    Child2(String name){
    super(name);
}
    void sleep(){
        System.out.println(name+" likes to sleep 8 hours");
    }
    void eat(){
      System.out.println(name+" likes to eat a pizza");
    }
    void rideOnBike(){
        System.out.println(name+" can ride on the bike");
    }

}
