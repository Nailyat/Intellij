package com.syntax.class03;

public class IfWithNoBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double temp=75;
		if (temp<32) {
			System.out.println("Water will freeze with tempature "+temp);
			
		}else {
			System.out.println("Water will NOT freeze with temperature "+temp);
			System.out.println("Because it is warm outside");
		}

		/*
		 * when if statement is used without {}
		 * then java allows only 1 statement for each print
		 * meaning 1 line for if block and 1 line for else block
		 */
		
		
	}
	

}
