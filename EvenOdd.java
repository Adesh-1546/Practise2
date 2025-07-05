package com.conditional;

import java.util.Scanner;

public class EvenOdd {
	
	public void checkEvenOdd(int num) {
		if(num%2==0) {
			System.out.println(num+" is Even");
		}else {
			System.out.println(num+" is Odd");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num = sc.nextInt();
		
		EvenOdd eo = new EvenOdd();
		eo.checkEvenOdd(num);
		sc.close();
	}

}
