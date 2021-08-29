package com.syntax.review.class02;

public class ShorthandOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		int num2=5;
		int num3=num+num2;
		System.out.println(num3);
		num=num*10;
		System.out.println(num);
		
		num+=10;
		System.out.println(num);
		
		int number=10;
		number+=20;
		System.out.println(number);
		number+=20+30;
		System.out.println(number);
		number+=number+50; //number=number+number+50 (number=80+80+50=210)
		System.out.println(number);//80+50=130 -->80+130=210 --> total=210
		
		int numb=10;
		numb*=numb+10;
		System.out.println(numb);// numb=10*(numb+10)=200 
		
		
		
	}

}
