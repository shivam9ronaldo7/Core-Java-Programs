package hackerearth.thirtyDaysOfCode;

import java.util.Scanner;

/*
-----
Task 
-----
Given an integer, n, perform the following conditional actions:
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

---------------
Sample Input 0
---------------
3

----------------
Sample Output 0
----------------
Weird

---------------
Sample Input 1
---------------
24

----------------
Sample Output 1
----------------
Not Weird

------------
Explanation
------------
Sample Case 0: n = 3
n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n = 24
n>20 and n is even, so it isn't weird. Thus, we print Not Weird.
*/

public class Day3 {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");  
        String ans = "";
        if (N % 2 == 1) {
            ans = "Weird";
        } else {
            if (N >= 6 && N <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
        scanner.close();
	}

}
