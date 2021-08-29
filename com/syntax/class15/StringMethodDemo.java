package com.syntax.class15;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I am a good tester. I am a good person";
		System.out.println(str.replace("a", "A")); // I Am A good tester. I Am A good person (all a from the sentence will be replaced to "A")
		System.out.println(str.replace("good", "perfect")); // I am a perfect tester. I am a perfect person

		String str2="jhgjdh2423529976fhhYGYHGUj$%$%^$%)(*&^%$#@!^%&";
		System.out.println(str2.replaceAll("[0-9]", "+")); // will replace all the numbers from 0-9 in the str2
		System.out.println(str2.replaceAll("[A-Z]","")); // will remove all the upper case letters from the original str2
		System.out.println(str2.replaceAll("[a-z]","")); // will remove all the lower case letters from the original str2
		System.out.println(str2.replaceAll("[a-z5-9]","")); // will remove all the lower case letters and numbers from 5-9 
		System.out.println(str2.replaceAll("[a-z5-9A-Z]","")); // will remove all the lower and upper case letters and numbers from 5-9 
		System.out.println(str2.replaceAll("[^a-z5-9A-Z]","")); //will remove all special characters except other symbols
		System.out.println(str2.replaceAll("[^a-z5-9A-Z]","").replace("G", "H")); // combine a few orders 
		System.out.println(str2.replace("^", ""));
		
		
		
		
		
		
		
		
		
	}

}
