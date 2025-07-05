package com.conditional;

import java.util.Scanner;

public class CheckCharacter {
	
	public void checkChar(char ch) {
		if(Character.isUpperCase(ch)) {
			System.out.println(ch+ " is Uppercase character");
		}else if (Character.isLowerCase(ch)) {
			System.out.println(ch+" is Lowercase character");
		}else if (Character.isDigit(ch)) {
			System.out.println(ch+ " is digit");
		}else {
			System.out.println(ch+ " is special character");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter word : ");
		char ch = sc.next().charAt(0);
		
		CheckCharacter c = new CheckCharacter();
		c.checkChar(ch);
		
		sc.close();
	}

}
