package com.looping;

import java.util.Scanner;

public class ReverseNum {
	
	public void doRev(int num) {
		int reverse = 0;
		while (num!=0) {
			int digit = num % 10 ;             //get last digit
			reverse = reverse * 10 + digit ;   //append digit
			num = num / 10 ;                   //remove last digit
		}
		System.out.println("Reversed number is : "+reverse);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		ReverseNum rev = new ReverseNum();
		rev.doRev(num);
		
		sc.close();
		
		
	}

}
