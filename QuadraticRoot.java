package com.conditional;

import java.util.Scanner;

public class QuadraticRoot {
	
	public void checkNatureOfRoots(double a, double b , double c) {
		
		double discriminant = b * b + 4 * a * c;
		
		if (discriminant == 0 ) {
			System.out.println("Roots are real and equal");
		}else if (discriminant > 0) {
			System.out.println("Root are real and distinct");
		}else {
			System.out.println("Roots are imaginary (complex)");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter coeficient of a : ");
		double a = sc.nextDouble();
		
		System.out.println("Enter coeficient of b : ");
		double b = sc.nextDouble();
		
		System.out.println("Enter coeficient of c : ");
		double c = sc.nextDouble();
		
		if(a==0) {
			System.out.println("Coefficent of A cannot be 0");
		}else {
			QuadraticRoot r = new QuadraticRoot();
			r.checkNatureOfRoots(a, b, c);
		}
		sc.close();
	}

}
