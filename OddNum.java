package com.looping;

// print odd number from 50 - 100
public class OddNum {
	
	public static void main(String[] args) {
		
		for( int i = 50 ; i <=100 ; i++) {
			if (i % 2 != 0 ) {
				System.out.println(i);
			}
		}
	}

}
