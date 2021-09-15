package com.syntax.class27.GroupTask.Task5;

public class RegistrationTester {
    public static void main(String[] args) {

        Registration registration=new Registration();
        registration.signUpEmail("blabla@yahoo.com");
        registration.signUpEmail("blabla@gmail.com");
        System.out.println(registration.getEmail());

        registration.creatingUserName("Nailya");
        registration.creatingUserName(" ");
        registration.creatingUserName("bla");
        System.out.println(registration.getUserName());

        registration.creatingPassword("123Pas");
        registration.creatingPassword(" ");
        registration.creatingPassword("Nailya");
        System.out.println(registration.getPassword());
    }
}
