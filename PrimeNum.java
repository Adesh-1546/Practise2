package com.looping;

import java.util.Scanner;

//prime number are divisible by 1 and number itself

public class PrimeNum {
	
	public void checkPrime(int num) {
		int count = 0 ;        //initial count=0
		
		for (int i = 1 ; i <= num ; i++) {  //loop till number
			if (num % i == 0) {         
				count++;  
			}
		}
		
		
		//if divisible by 1 and itself print
		if (count==2) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is Not Prime");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		PrimeNum p = new PrimeNum();
		p.checkPrime(num);
		
		sc.close();
	}

}
