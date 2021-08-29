package com.syntax.class07;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		System.out.println("------------WHILE Example------------");
		int i=1;
		while (i<3) {
			System.out.println("Hello");
			i++;
		}
		System.out.println("------------DO WHILE Example------------");
		int j=1;
		do {
			System.out.println("Hello");
			j++;
		}while(j<=3);
		
		System.out.println("------------DO WHILE Examples------------");
		// print numbers from 1 till 10 using do while loop
		int n=1;
		do {
			System.out.print(n);
			n++;
		}while(n<=10);
	}

}
