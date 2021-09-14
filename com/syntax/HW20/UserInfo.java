package com.syntax.HW20;

public class UserInfo extends UserClass {

    String address;

    UserInfo(String name, String mobileNo, String address) {
        super(name, mobileNo);
        this.address=address;
    }
    void userDetails(){
        System.out.println(name+" "+mobileNo+" "+address);
    }

    public static void main(String[] args) {
UserInfo userInfo=new UserInfo("Nailya", "123456789","123 st");
userInfo.userDetails();
    }
}