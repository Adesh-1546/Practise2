package com.looping;

public class PrimeNum1to100 {
	
	public static void main(String[] args) {
		
		for (int num = 2 ; num <=100; num++) {
			int count = 0 ;
			
			
			for(int i = 1 ; i <= num ; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			
			if (count==2) {
				System.out.println(num);
			}
			
		}
		
		
	}

}
