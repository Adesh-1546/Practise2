package com.conditional;

import java.util.Scanner;

public class PosNeg {
	
	public void checkPosNeg(int num){
		if (num > 0 ) {
			System.out.println(num+ " is Positive");
		}else if(num < 0){
			System.out.println(num+" is Negative");
		}else {
			System.out.println("Number is zero");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num = sc.nextInt();
		
		PosNeg pn = new PosNeg();
		pn.checkPosNeg(num);
		sc.close();
		
		
	}

}
