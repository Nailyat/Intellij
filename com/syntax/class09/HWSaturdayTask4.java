package com.syntax.class09;

public class HWSaturdayTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// From an array of integer elements find the largest number
		
		int [] num = {12, 23, 45, 67, 89};
		int largest=num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]>largest) {
				largest=num[i];
		}
			
	}
		System.out.println(largest);
}
}