package com.looping;

import java.util.Scanner;

public class SumNaturalNumbers {
	
	public void SumofNaturalNum(int num) {
		int sum = 0 ;
		for (int i = 0 ; i <= num ; i++) {
			sum = sum + i ;
		}
		System.out.println("Sum of "+num+" is : "+sum);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		if (num <= 0 ) {
			System.out.println("Enter positive number");
		}else {
			SumNaturalNumbers sm = new SumNaturalNumbers();
			sm.SumofNaturalNum(num);
		}
		sc.close();
	}

}
