package com.syntax.HW24;

public class CreditClass {

    // Task 2
    /* Create a class CreditCard and define variable balance and interest.
       Create an instance method that will calculate interest based on the given balance.
       Create 2 subclasses: Visa and AX.
       In AX class override method calculate interest.
       Call the method by creating an object of each of the three classes. */

    double balance;
    double interest;
    CreditClass(double balance){
        this.balance=balance;
        //calculateInterest();
    }

    void calculateInterest(){
        interest=balance*0.15;
        System.out.println("From parent Yearly interest is  "+interest);
    }
}
class Visa extends CreditClass{
    Visa(double balance) {
        super(balance);
    }
}
class AX extends CreditClass{
    AX(double balance){
        super(balance);
        //calculateInterest();
    }
    void myOwnMethod(){
        System.out.println("Child method");
    }
    void calculateInterest(){
        interest=balance*0.10;
        System.out.println("Yearly interest is  "+interest);
    }
}