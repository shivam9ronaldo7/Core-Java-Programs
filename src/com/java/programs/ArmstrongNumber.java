package com.java.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Please enter the number to check if its Armstrong or not");
		
		//Using scanner to take input from user
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt(),tempNumber1 = 0,power=0;		
		
		sc.close();
		
		//Using loop to count total number of digits
		for(int i = number; i!=0;++power) {
			i=i/10;
		}
		
		//Using loop to calculate Armstrong
		for(int i = number; i!=0;) {
			tempNumber1 = (int) Math.pow((i%10), power) + tempNumber1;
			i = i/10;
		}
		
		//Comparing number with Armstrong result
		if(number==tempNumber1)
			System.out.println("It is a Armstrong number");
		else
			System.out.println("Its not a Armstrong number");		
	}
}
