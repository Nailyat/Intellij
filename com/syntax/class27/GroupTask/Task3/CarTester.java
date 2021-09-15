package com.syntax.class27.GroupTask.Task3;


public class CarTester {
    public static void main(String[] args) {

       Car sedan=new Sedan(35000, 15);
        System.out.println("The price of sedan is "+sedan.calculateSalePrice());

        Car truck=new Truck(90000, 3000 );
        System.out.println("The price of truck is "+truck.calculateSalePrice());
    }
}
