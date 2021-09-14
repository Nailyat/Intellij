package com.syntax.HW25;

public class HP extends Computer{
    HP (String model){
        super(model);
    }
    void download (){
        System.out.println(model+" can download an application with HPSmart");
    }
    void antivirus(){
        System.out.println(model+" uses antivirus");
    }
    void screen(){
        System.out.println(model+" has a touch screen");
    }
}
