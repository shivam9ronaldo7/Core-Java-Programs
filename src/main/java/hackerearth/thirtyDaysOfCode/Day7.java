package hackerearth.thirtyDaysOfCode;

import java.util.Scanner;

/*
-----
Task
-----
Given an array, A, of N integers, print A's elements in reverse order as a single line of 
space-separated numbers.

-------------
Sample Input
-------------
4
1 4 3 2

--------------
Sample Output
--------------
2 3 4 1
*/
public class Day7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraySize = Integer.parseInt(scanner.nextLine());
		String[] array = scanner.nextLine().split(" ");
		for(int i = arraySize-1; i>=0 ; --i) {
			System.out.print(array[i]+" ");
		}
		scanner.close();
	}
}
