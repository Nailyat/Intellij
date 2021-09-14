package com.syntax.class27.EncapsulationDemo1;

import sun.security.util.Password;

import java.net.PasswordAuthentication;

public class BankAccount {

   private String name;
   private double balance;
   private String userName;
   private String password;

   private void getBalance(){
       this.balance=balance;
   }
   public String setUserName(String userName){
       return userName;
   }
   public void getUserName(){
       this.userName=userName;
   }
   public String getPassword(){
       return password;
   }
   public void setPassword(String password){
       this.password=password;
   }
   void setName(String name){
       if (name.length()>50){
           System.out.println("Please reduce the length of the name");
       }else if(name.replaceAll("[^A-Za-z]","").length()==name.length()){
           System.out.println("Special characters and numbers are not allowed in name");
       }else {
           this.name=name;
       }
   }
   /*  double getBalance(String password){
       if(this.password.equals(password)){
           return  balance;
    }else{*/


}
