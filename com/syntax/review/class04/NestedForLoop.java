package com.syntax.review.class04;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		for(int i=0; i<10; i++) {
			x=i;
			while(x<5) {
			System.out.println(x);
			x++;
			}
		}
		
		System.out.println("-------------------");
		for (int j=0; j<2; j++) {
			System.out.println(j);
			for (int k=0; k<2; k++) {
				System.out.println(k);
			}
		}
		System.out.println("-------------------");
		for (int n=0; n<2; n++) {
			for (int m=0; m<2; m++) {
				for (int l=0; l<2; l++) {
					System.out.println("n = "+n+" m = "+m+" l = "+l);
				}
			}
		}
		
		System.out.println("-------------------");
		for (int y=0; y<3; y++) {
			for (int q=0; q<3; q++) {
					System.out.println("*");
				}
			}
		
		
		
	}

}
