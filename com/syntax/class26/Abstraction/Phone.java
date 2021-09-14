package com.syntax.class26.Abstraction;

public abstract class Phone {

    public void makePhoneCall(){
        System.out.println("Calling");
    }
    public void sendSMS(){
        System.out.println("Sending message");
    }
    public abstract void takePictures();
    public abstract void unlock();

}
class IPhone extends Phone implements CallAble{

    public void takePictures(){
        System.out.println("Take pictures with 12 Megapixels camera");
    }

    public void unlock() {
        System.out.println("Unlocks a screen with face ID");

    }
    @Override
    public void method(){
        System.out.println("This device can make calls");
    }
}
class Samsung extends Phone{
    public void takePictures(){
        System.out.println("Take pictures with 108 Megapixels camera");
    }
    public void unlock() {
        System.out.println("Unlocks a screen with fingerprint");

    }
}