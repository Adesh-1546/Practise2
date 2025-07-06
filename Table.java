package com.looping;

import java.util.Scanner;
public class Table {
	
	public void makeTable(int num) {
		for (int i = 0 ; i <= 10 ; i++ ) {
			System.out.println(num+" * "+i+ " = "+num*i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter table you want : ");
		int num = sc.nextInt();
		
		Table t = new Table();
		t.makeTable(num);
		sc.close();
	}

}
