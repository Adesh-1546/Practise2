package com.looping;

import java.util.Scanner;


public class NumberPalindrome {
	public void checkPalindrome(int num) {
		int original = num;
		int reverse = 0 ;
		
		//reverse num
		while(num!=0) {
			int digit = num % 10 ;
			reverse = reverse * 10 + digit ;
			num = num / 10 ;
		}
		if (original == reverse) {
			System.out.println("No. is Palindrome");
		}else {
			System.out.println("No. is not a Palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		NumberPalindrome p = new NumberPalindrome();
		p.checkPalindrome(num);
		
		sc.close();
		
	}

}
