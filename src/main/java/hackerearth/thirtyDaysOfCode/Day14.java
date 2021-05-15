package hackerearth.thirtyDaysOfCode;

import java.util.Scanner;

/*
----
Task
----
Complete the Difference class by writing the following:

A class constructor that takes an array of integers as a parameter and saves it to the elements instance variable.
A computeDifference method that finds the maximum absolute difference between any 2 numbers in N and stores it in the maximumDifference instance variable.

-----------
Constraints
-----------
* 1<=N<=10
* 1<=elements[i]<=100, where 0<=i<=N-1

-------------
Output Format
-------------
You are not responsible for printing any output; the Solution class will print the value of the maximumDifference instance variable.

------------
Sample Input
------------
3
1 2 5

-------------
Sample Output
-------------
4

-----------
Explanation
-----------
The scope of the elements array and maximumDifference integer is the entire class instance. The class constructor saves the argument passed to the constructor as the elements 
instance variable (where the computeDifference method can access it).

To find the maximum difference, computeDifference checks each element in the array and finds the maximum difference between any 2 elements: 
|1-2|=1
|1-5|=4
|2-5|=3

The maximum of these differences is 4, so it saves the value 4 as the maximumDifference instance variable. The locked stub code in the editor then prints the value stored as 
maximumDifference, which is 4.
*/

public class Day14 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        //Difference difference = new Difference(a);

        //difference.computeDifference();

        //System.out.print(difference.maximumDifference);
    }

}

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here

}
