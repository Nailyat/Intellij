package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//I want to print "How are you?" 10 times
		
		int i=1;
		while(i<10) {
			System.out.println("How are you?");
			i++;
		}

		//I want print numbers from 1 to 20
		int a=1;
		while(a<=20) {
			System.out.println(a);
			a++;
		}
		
		//I want to print numbers from 100 to 150
		int b=100;
		while(b<=150) {
			System.out.print(b+" ");
			b++;
		}
		// I want to print numbers from 10 to 1
		int num=10;
		while(num>=1) {
			System.out.println(num);
			num--;
		}
		// I want to print odd numbers from 1 to 20
		int number=1;
		while(number<=20) {
				System.out.println(number);
				number+=2; //or we can add IF condition if(number%2!=0) --> number++;
		}
		
	}

}
