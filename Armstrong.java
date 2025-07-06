package com.FiArPa;

import java.util.Scanner;

public class Armstrong {
	
	public void checkArmstrong(int num) {
		int original = num ; 
		int sum = 0;

		while( num != 0) {
			int digit = num % 10 ;
			int cube = digit * digit * digit ;
			sum = sum + cube;
			num = num / 10 ;
		}
		if (original == sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("not a Armstrong");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int num = sc.nextInt();
		
		Armstrong a = new Armstrong();
		a.checkArmstrong(num);
		sc.close();
		
	}

}
