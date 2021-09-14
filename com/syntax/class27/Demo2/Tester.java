package com.syntax.class27.Demo2;

public class Tester {
    public static void main(String[] args) {

       Car car =new Mersedes();
       car.start();
       car.stop();

       Drivable drivable=new Mersedes();
       drivable.drive();
        ((Mersedes)drivable).start();
}}
