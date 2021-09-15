package com.syntax.class27.GroupTask.Task5;

public class Registration {

   /* Create  Registration  Class  in  which  you would have variables as email, userName and password
   that have an access scope only within its own class.
    After creating an object of the class user should be able to call methods and in each method separately
    pass values to set users email, username and password.
    Requirements:
    A.Valid email consider to be only yahoo
    B.Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also valid password cannot contain userName.
    */

   private String email;
   private String userName;
   private String password;

   String getEmail(){
       return email;
   }
    void signUpEmail(String email){
       if(email.contains("yahoo")){
           this.email=email;
       }else{
           System.out.println("Valid email consider to be only yahoo");
       }
    }

    String getUserName(){
       return userName;
    }

    void creatingUserName(String userName){
        if(userName.isEmpty() || userName.length()<6) {
            System.out.println("Valid userName cannot be empty and should be of length larger than 6 characters.");
        }else{
            this.userName=userName;
        }
    }
    String getPassword(){
       return password;
    }

    void creatingPassword(String password) {
        if (password.isEmpty() || password.length() < 6) {
            System.out.println("Valid password cannot be empty and should be of length larger than 6 characters.");
        }else if(password.contains(this.userName)){
            System.out.println("Valid password cannot contain userName");
        }else {
           this.password=password;
       }
    }
}