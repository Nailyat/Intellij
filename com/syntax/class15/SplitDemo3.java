package com.syntax.class15;

public class SplitDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="This is Batch 10? Batch 10 is grest? How are you";
		String [] strArr=str.split("[?]");
		
		
		System.out.println(strArr.length);
		
		for(String string:strArr) {
			
			System.out.println(string);
			
			}

	}

}
