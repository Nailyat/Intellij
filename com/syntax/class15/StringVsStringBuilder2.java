package com.syntax.class15;

public class StringVsStringBuilder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ABCD";
		System.out.println(str.concat("Z"));
		System.out.println(str);
		
		StringBuilder str2=new StringBuilder("ABCD");
		System.out.println(str2.append("Z"));
		System.out.println(str2);
		
		StringBuilder str3=new StringBuilder("Sunday");
		System.out.println(str3.reverse());
		
		String name="Nailya";
		StringBuilder str4=new StringBuilder(name);// converting a String to StringBuilder
		System.out.println(str4);
		
		name=str4.toString(); // converting a StringBuilder to String
		System.out.println(name);
		
		StringBuffer strin = new StringBuffer();
		

	}

}
