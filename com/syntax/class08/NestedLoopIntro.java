package com.syntax.class08;

public class NestedLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=3; i++) {
			System.out.println("I am in i loop");
			
			for(int j=0; j<=3; j++) {
				System.out.println("I am in j loop");
			}// one loop of i then 4 loops of j --> and again --> total 3 i loops with 4 j loops inside
		}

		System.out.println("------------------------");
		
		for (int i=1; i<4; i++) {
			for(int j=1; j<3; j++) {
				System.out.println(i+" "+j);
			}
		}
	}

}
