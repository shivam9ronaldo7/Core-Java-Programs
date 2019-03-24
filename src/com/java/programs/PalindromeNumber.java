package com.java.programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println("Please enter the number to check if its Palindrome or not");

		//Using scanner to take input from user
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt(),tempNumber1 = 0;		

		sc.close();
		
		//Using loop to calculate Palindrome
		for(int i = number ; i!=0 ; ) {
			tempNumber1 = (i%10) + tempNumber1*10;
			i=i/10;
		}

		//Comparing number with Palindrome result
		if(number==tempNumber1)
			System.out.println("It is a Palindrome number");
		else
			System.out.println("Its not a Palindrome number");	

	}

}
