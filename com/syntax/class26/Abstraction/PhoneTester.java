package com.syntax.class26.Abstraction;

public class PhoneTester {
    public static void main(String[] args) {

        Phone phone=new IPhone();
        phone.makePhoneCall();
        phone.sendSMS();
        phone.takePictures();
        phone.unlock();

        Phone phone1=new Samsung();
        phone1.makePhoneCall();
        phone1.sendSMS();
        phone1.takePictures();
        phone1.unlock();

        CallAble callAble=new IPhone();
        callAble.method();
    }
}
