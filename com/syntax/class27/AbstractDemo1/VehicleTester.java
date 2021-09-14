package com.syntax.class27.AbstractDemo1;

public class VehicleTester {
    public static void main(String[] args) {

        BMW bmw = new BMW("BMW","X5","123", "Sedan");
        bmw.start();
        bmw.drive();
        bmw.stop();
       // bmw.toString(); coming from Object class,
        // all the classes are automatically inherit from that class
        bmw.displayInfo();
        bmw.displayTotalVehicles();

        Car car=new Toyota("Toyota", "Camry","sedan", "234");
        ((Toyota)car).displayInfo();
    }
}
