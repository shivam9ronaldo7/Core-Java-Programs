package com.java.programs;

import java.util.Arrays;

public class SecondMaxInArray {

	public static void main(String[] args) {
		//Array with integer value in it
		int[] intArray = {2,34,5,66,3,4,6,3,6,77,2};
		
		//Sorting array
		Arrays.sort(intArray);
		
		//Printing the 2nd max value in an array
		System.out.println("2nd max value in the array is "+intArray[intArray.length-2]);
		
	}

}
