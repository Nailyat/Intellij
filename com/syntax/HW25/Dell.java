package com.syntax.HW25;

public class Dell extends Computer{
    Dell (String model){
        super(model);
    }
    void download (){
        System.out.println(model+" can download an application");
    }
    void antivirus(){
        System.out.println(model+" uses ESET antivirus");
    }
    void design(){
        System.out.println(model+" has a fancy design");
    }
}
