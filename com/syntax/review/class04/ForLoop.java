package com.syntax.review.class04;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		for(System.out.println("Printed only once"); i<5; System.out.println("executed again and again")) {
			System.out.println(i);
			i++;
		}
		System.out.println("------------------------");
		int j=0;
		for(System.out.println("x"); j<5; System.out.println("y")) {
			System.out.println(j);
			j++;
		}
		System.out.println("------------------------");
		for (int k=0;k<10;k=k+5) { // printed 0 and 6
			System.out.println(k);
				k++;
			}
		System.out.println("------------------------");
		for (int n=0; n<10; n+=1) { // printed infinite times
			System.out.println(n);
			n--;
		}
		}
	}


