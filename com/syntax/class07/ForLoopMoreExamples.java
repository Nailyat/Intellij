package com.syntax.class07;

public class ForLoopMoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * I want to print multiplication table
		 * 1*1=1;
		 * 1*2=2;
		 * ....
		 * 1*10=10;
		 */

		int num=1; // we can put any number 
		for(int i=1; i<=10; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
	}

		System.out.println("--------Another Example-----------");
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum=sum+i; //0+1=1 -> 1+2=3 -> 3+3=6 -> 6+4=10 -> 10+5=15
		}
		System.out.println(sum);
		

		System.out.println("--------Another Example-----------");
		int summ=0;
		for(int j=0; j<=40; j+=10) {
			summ+=j; //0+0=0 -> 0+10=10 -> 10+20=30 -> 30+30=60 -> 60+40=110 
		}
		System.out.println(summ);
		
		System.out.println("--------Another Example-----------");
		int total=0;
		for(int k=1; k<=10; k++) {
			total*=k; //0*1=0 -> 0*2=0 ->... 0*10=0 
		}
		System.out.println(total); 
		
		
		System.out.println("--------Another Example-----------");
		int totall=1;
		for(int n=1; n<10; n++) {
			total*=n; //1*1=1 -> 1*2=2 -> 2*3=6 -> 6*4=24 -> 24*5=120 -> 120*6=720 -> 720*7=5040 -> 5040*8=40320 -> 40320*9=362880
		}
		System.out.println(totall);


		
		
}
}