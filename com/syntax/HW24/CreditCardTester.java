package com.syntax.HW24;

public class CreditCardTester{
    public static void main(String[] args) {

       /*  CreditClass creditClass=new CreditClass(1000);
        creditClass.calculateInterest();
        Visa visa=new Visa(1000);
        visa.calculateInterest();
        AX ax=new AX(1000);
        ax.calculateInterest(); */

     CreditClass creditClass1=new AX(120); //we can put a smaller(child) class in bigger(parent) class
     creditClass1.calculateInterest(); //calls method from new class
     AX ax2=(AX)creditClass1;

}}