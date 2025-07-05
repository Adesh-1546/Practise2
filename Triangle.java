package com.conditional;

import java.util.Scanner;

public class Triangle {
	
	public void checkTriangle(int s1,int s2,int s3) {
		if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)) {
			if (s1==s2 && s2== s3) {
				System.out.println("It is Equilateral Triangle");
			}else if (s1 == s2 || s2 == s3 || s1 == s3) {
				System.out.println("It is Isoceles Triangle");
			}else {
				System.out.println("It is Scalene Triangle");
			}
		}else {
			System.out.println("Sides do not satisfy triangle inequality property");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st side of Triangle : ");
		int s1 = sc.nextInt();
		
		System.out.println("Enter 2nd side of Triangle : ");
		int s2 = sc.nextInt();
		
		System.out.println("Enter 3rd side of Triangle : ");
		int s3 = sc.nextInt();
		
		Triangle t = new Triangle();
		t.checkTriangle(s1,s2,s3);
		sc.close();
	}

}
