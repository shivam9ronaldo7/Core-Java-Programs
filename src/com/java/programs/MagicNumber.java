package com.java.programs;

public class MagicNumber {
	
	public static int isMagic(int num) {
		int sum = num;
		
		while(sum>=9) {
			sum = 0;
			while(num>0) {
				sum = sum+(num%10);
				num = num/10;
			}
			num = sum;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		//A number is said to be a Magic number if the
		//sum of its digits are calculated till a single
		//digit is obtained by recursively adding the sum of its digits.
		//If the single digit comes to be 1 then the number is a magic number.
		
		int sum = isMagic(199);
		
		if(sum==1)
			System.out.println("Magic number");
		else
			System.out.println("Not a Magic number");

	}

}
