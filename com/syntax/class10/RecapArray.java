package com.syntax.class10;

public class RecapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]=new String[2]; // shorthand
		System.out.println(a.length);
		for(String aa:a) {
			System.out.println(aa);
		}
		System.out.println("---------------------");
		
		String[] array=new String [3];
		array[0]="Hello";
		array[1]="Hi";
		//System.out.println(array[3); -->ArrayIndexOutOfBoundExeption: 3
		
		System.out.println(array[2]); //null
		int size=array.length;
		System.out.println(size);

		array[2]="How are you?";
		System.out.println(array[2]); // How are you?
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]+"; ");
		}
		System.out.println("-------------------");
		
		for(String arr:array) {
			System.out.println(arr+"; ");
		}
		
	}

}
