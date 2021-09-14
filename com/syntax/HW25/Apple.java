package com.syntax.HW25;

public class Apple extends Computer{

    Apple (String model){
        super(model);
    }
    void download (){
        System.out.println(model+" can download an application");
    }
    void antivirus(){
        System.out.println(model+" uses IOS antivirus");
    }

    void appPay(){
        System.out.println(model+" can make a payment through ApplePay");
    }
}
