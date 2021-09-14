package com.syntax.review.class08;

public class Mobile {

   private String make;
    String model;
   protected int mainMemory;
   public int secondaryMemory;

    public Mobile(String make, String model, int mainMemory, int secondaryMemory){  //private constructor
       this.make=make;
       this.model=model;
       this.mainMemory=mainMemory;
       this.secondaryMemory=secondaryMemory;
   }
   private void printInfo(){ // private method
       System.out.println(make+" "+model+" "+mainMemory);
   }
   public void printModel(){
       System.out.println(model);
   }
   protected static void printHello(){
       System.out.println("Hello");
   }
   public void printMake(){
       System.out.println(make);
   }

    public static void main(String[] args) {
        Mobile mobile=new Mobile("IPhone", "XII", 8, 512);
        mobile.printInfo();
    }
}
class MobileTester{
    public static void main(String[] args) {

        Mobile mobile= new Mobile("Iphone", "X", 8, 264);
    }
}
