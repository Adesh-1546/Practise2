package com.conditional;

import java.util.Scanner;

public class Password {
	
	public void checkPassword(String uname, String pass) {
		 String username = "Adesh";
		 String password = "Adeshpol@1546";
		 
		 if ((uname.equals(password)) || (pass.equals(password))) {
			 if (!uname.equals(username)) {
				 System.out.println("Invalid username");
			 }else if (!pass.equals(password)){
				 System.out.println("Incorrect password");
			 }else {
				 System.out.println("Welcome");
			 }
		 }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String uname = sc.nextLine();
		
		System.out.println("Enter Password: ");
	    String pass = sc.nextLine();
	    
	    Password p = new Password();
	    p.checkPassword(uname, pass);
	    sc.close();
	}

}
