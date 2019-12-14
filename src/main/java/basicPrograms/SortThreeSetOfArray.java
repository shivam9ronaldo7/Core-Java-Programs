package basicPrograms;

import java.util.Arrays;

/*
-----
Task 
-----
Write a program to sort an array in the sets of three

---------------
Sample Input 1
---------------
arr = {2,3,1,2,1,3,3,2,1,3,4,1,2}

----------------
Sample Output 1
----------------
arr = {1,2,3,1,2,3,1,2,3,1,3,4,2}

---------------
Sample Input 2
---------------
arr = {2,3,1,2,1,3,3,2,1,3,4,1,2,6,8}

----------------
Sample Output 2
----------------
arr = {1,2,3,1,2,3,1,2,3,1,3,4,2,6,8}

*/

public class SortThreeSetOfArray {

	public static void main(String[] args) {
		int[] arr = {2,3,1,2,1,3,3,2,1,3,4,1,2};
		int[] temp = new int[3];
		int counter=1;
		for(int i=0; i<arr.length; ++i) {
			temp[counter-1] = arr[i];
			if(counter%3==0 || i==arr.length-1) {
				System.out.println(Arrays.toString(temp));
				temp = new int[3];
				counter=1;
				continue;
			}
			++counter;
		}
	}

}
