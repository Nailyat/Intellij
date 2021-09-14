package com.syntax.repl;

import com.syntax.review.class08.Mobile;

public class MobileTester extends Mobile{

        public MobileTester(String make, String model, int mainMemory, int secondaryMemory){
            super(make, model, mainMemory, secondaryMemory);
        }
       public void printInfo(){
            printModel();
    }

    public static void main(String[] args) {
        Mobile mobile=new Mobile("IPhone", "X", 8, 256);
        mobile.printModel();
        printHello();
    }
}
