package com.syntax.HW25;

public class Lenovo extends Computer {
    Lenovo (String model){
        super(model);
    }
    void download (){
        System.out.println(model+" can download an application");
    }
    void antivirus(){
        System.out.println(model+" uses regular antivirus");
    }
    void print(){
        System.out.println(model+" can print file from the mobile phone");
    }
}
