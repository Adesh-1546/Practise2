package com.looping;

import java.util.Scanner;

public class PowerofNum {
	
	public void doPower(int num, int expo) {
		int result = 1 ; 
		
		for(int i = 1 ; i <= expo ; i++) {
			result = result * num;
		}
		System.out.println(num+" with the power "+expo+" is : "+result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter exponent: ");
		int expo = sc.nextInt();
		
		PowerofNum p  = new PowerofNum();
		p.doPower(num,expo);
		
		sc.close();
	}

}
