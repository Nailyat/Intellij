package com.syntax.class05;

public class LogicalNOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean b=!true;
		boolean a=!false;
		System.out.println(b); //false
		System.out.println(a);//true
		
		boolean hungry=false; //if TRUE -->NO RESULT
		if(!hungry) {
			System.out.println("I am not hungry");
			
		}
		boolean hot=false; // if TRUE -->NO RESULT
		if(!hot) {
			System.out.println("I'll go for a walk");
		}
		System.out.println("End of the class code");
		
		String password="Nailya";

		if(!password.equals("Daulet")) {
			System.out.println("Wrong password");
		}
	}

}
