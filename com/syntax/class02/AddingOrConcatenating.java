package com.syntax.class02;

public class AddingOrConcatenating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Hello";
		String b="World";
		
		int c=10;
		int d=20;
		
		System.out.println(c+d+a+b);//30HelloWorld
		System.out.println(a+c+b+d);//Hello10World20
		System.out.println(a+(c+d)+b);//Hello30World
		System.out.println(a+c+d+b);//Hello1020World
		System.out.println(a+b+c+d);//HelloWorld1020
	
		String combined=a+b+c+d;
		System.out.println(combined);//HelloWorld1020
		
		
		
		char grade='A';
		String str="Student";
		String newstr=grade+" "+str;
		System.out.println(newstr);
		
		
		
		 
	}

}
