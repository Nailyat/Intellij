package com.syntax.class27.GroupTask.Task3;

public class Car {

    /* Task 3
    Create  a  Class  Car  that  would  have  the following  fields:
    carPrice  and  color  and method calculateSalePrice() which should be returning a price of the car.
    Create 2 sub classes: Sedan and Truck.
    The Truck  class  has  field  as  weight  and  has  its own implementation of calculateSalePrice() method
    in which returned price calculated as following: if weight>2000 then returned price car should include 10% discount,
    otherwise 20% discount.
    The Sedan class has field as length and also does its own implementation of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */

    double carPrice;
    String color;


    double calculateSalePrice() {
        return 0;
    }
}
class Sedan extends Car{

    double length;

    public Sedan(double carPrice,  double length) {
        this.carPrice = carPrice;
        this.length = length;
    }

    double calculateSalePrice() {
        if(length>20){
            return (carPrice-(carPrice*0.05));
        }else{
        return (carPrice-(carPrice*0.1));
    }
}}
class Truck extends Car{

    double weight;

    public Truck(double carPrice,  double weight) {
        this.carPrice = carPrice;
        this.weight = weight;
    }

    double calculateSalePrice(){
    if (weight>2000){
             return(carPrice-(carPrice*0.1));
        }else{
        return(carPrice-(carPrice*0.2));
    }
    }
}