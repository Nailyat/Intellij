package com.syntax.review.class04;

public class ShortHandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		System.out.println(i);
		i++;
		
		int j=10;
		System.out.println(j);
		j--;

		int x=10;
		System.out.println(++x); //x=11
		System.out.println(x++); //
		System.out.println(x);

		int k=10;
		System.out.println(++k+(++k));
		
		int n=10;
		System.out.println(n+++(n++));
	}

}
