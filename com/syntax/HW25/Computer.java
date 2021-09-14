package com.syntax.HW25;

public class Computer {

    // Task
    /* Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    ●Define common behavior within and some fields in parent class and override some of the methods in child classes
    ●Define some methods specific to child classes
    ●Create objects of child classes and store them into array.
      Loop through each object and execute available methods.  */

    String model;
    Computer(String model){
        this.model=model;
    }
    void download(){
        System.out.println("Download the application");
    }
    void antiVirus(){
        System.out.println(model+" uses antivirus");
    }
}
