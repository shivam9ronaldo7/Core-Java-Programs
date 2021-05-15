package hackerearth.thirtyDaysOfCode;

import java.util.Scanner;

/*
-----
Task 
-----
Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 
integer denoting the maximum number of consecutive 1's in n's binary representation.

---------------
Sample Input 1
---------------
5

----------------
Sample Output 1
----------------
1

---------------
Sample Input 2
---------------
13

----------------
Sample Output 2
----------------
2

------------
Explanation
------------
Sample Case 1: 
The binary representation of 5 is 101, so the maximum number of consecutive 1's is 1.

Sample Case 2: 
The binary representation of 13 is 1101, so the maximum number of consecutive 1's is 2.
*/

public class Day10 {	
	private static final Scanner scanner = new Scanner(System.in);	
	public static void main(String[] args) {
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        int r;
        long b = 0;
        for(long i=1;n!=0;i=i*10) {
        	r = n%2;
        	n = n/2;
        	b = b+(r*i);
        }
        String[] numStrArr = Long.toString(b).split("");
        int counter = 0, max = 0;
        for(String numStr: numStrArr) {
        	if(numStr.equals("1"))
        		++counter;
        	else
        		counter = 0;        	
        	if(counter>max)
        		max = counter;
        }
        System.out.println(max);
	}	
}
