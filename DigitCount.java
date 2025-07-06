package com.looping;
import java.util.Scanner;

public class DigitCount {
	
	public void countDigit(int num) {
		long count = 0 ; 
		if (num == 0) {
            count = 1;  // special case: 0 has 1 digit
        } else {
            while (num != 0) {
                num = num / 10;  // remove last digit
                count++;
            }
        }
		System.out.println("No. of digits : "+count);
	}
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num = sc.nextInt();
		
		DigitCount d = new DigitCount();
		d.countDigit(num);
		sc.close();
	}

}
