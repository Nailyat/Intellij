package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		//statement is like a ladder
		
		int day=7;
		
		if(day==1) {
			System.out.println("Taday is Monday");
		}else if(day==2) {
			System.out.println("Taday is Tuesday");
		}else if(day==3) {
			System.out.println("Taday is Wedsday");
		}else if(day==4) {
			System.out.println("Taday is Thuersday");
		}else if(day==5) {
			System.out.println("Taday is Friday");
		}else if(day==6) {
			System.out.println("Taday is Saturday");
		}else if(day==7) {
			System.out.println("Taday is Sunday");
		}else {
			System.out.println(day+" is invalid day number. Please enter day from 1-7");
		}
	
		
		
		
		System.out.println("----------USING SWITCH STATEMENT---------");
		// switch is a value based statement, if find matching value case and jumps right away
		//switch is like an elevator
		/*
		 * in switch always remember:
		 * variable type and case values MUST be of SAME dataType
		 * always use break;-->to stop and get out from switch block
		 * default is optional
		 */
		
		String dayName;
		switch(day) {
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
		    break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
			default:
				dayName="Invalid";
				break;
		}

		System.out.println("Today is "+dayName);
	}

}
