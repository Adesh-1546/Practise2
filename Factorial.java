package com.looping;

import java.util.Scanner;

public class Factorial {
	
	public void dofactorial(int num) {
		int factorial = 1 ;
		for (int i = num ; i >= 1 ; i--) {
			factorial = factorial * i ;
		}
		System.out.println("Factorial of "+num+" is : "+factorial);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number : " );
		int num = sc.nextInt();
		
		Factorial f = new Factorial();
		f.dofactorial(num);
		
		sc.close();
	}

}
