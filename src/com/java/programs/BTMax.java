package com.java.programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BTMax {

	public static void main(String[] args) {

		//Path where the Input.txt file resides
		String path = "C://Users//student_v//Desktop//Input.txt";

		//Calling read file method to get the binary tree values
		List<int[]> bTRows = readFile(path);
		
		//Calling method to find sum of max corresponding digits
		int sum = sumOfMaxInPath(bTRows);
		
		System.out.println("Sum =>"+sum);

	}

	//Method to find add every subsequent nmax number in line as we go
	//to the corresponding children
	static int sumOfMaxInPath(List<int[]> bTRows) {
		
		//Total number of rows or height of tree
		int rows = bTRows.size();

		//1st value of the binary tree
		int sum = bTRows.get(0)[0];

		//Variable to store parent node position, maximum number
		//1st element under parent node & 2nd element under parent node
		int pNPos = 0;
		int maxNum;
		int c1Pos;
		int c2Pos;
		
		//Loop to iterate over rows
		for(int i = 1; i<rows; ++i) {
			
			//Formula to find 1st and 2nd element under max parent element
			c1Pos = (2*pNPos);
			c2Pos = (2*pNPos)+1;
			
			//Find the max number of the two
			if(bTRows.get(i)[c1Pos]>bTRows.get(i)[c2Pos]) {
				pNPos = c1Pos;
				maxNum = bTRows.get(i)[c1Pos];
			}else {
				pNPos = c2Pos;
				maxNum = bTRows.get(i)[c2Pos];
			}			
			sum = sum + maxNum;
			
		}
		
		return sum;
		
	}

	//Method to read data from Text file
	static List<int[]> readFile(String path) {
		Scanner sc = null;
		List<int[]> bTRows = null;

		try {
			//Using scanner class to read the
			sc = new Scanner(new BufferedReader(new FileReader(path)));

			//Creating a list of arrays
			bTRows = new ArrayList<int[]>();

			//Using scanner class method to read text file line by line
			while(sc.hasNext()) {

				//Using streams to load all the numbers in a list of arrays 
				bTRows.add(Arrays.stream(sc.nextLine().split("\\s+"))
						.mapToInt(Integer::parseInt).toArray());

			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {

			//Closing the scanner object
			sc.close();

		}

		return bTRows;
	}

}


