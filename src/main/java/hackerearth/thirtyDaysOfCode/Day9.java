package hackerearth.thirtyDaysOfCode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
-----
Task 
-----
Write a factorial function that takes a positive integer, N as a parameter and prints the 
result of N!(N factorial).

Note: If you fail to use recursion or fail to name your recursive function factorial or 
Factorial, you will get a score of 0.

-------------
Sample Input
-------------
3

--------------
Sample Output
--------------
6

------------
Explanation
------------
Consider the following steps:
1. factorial(3) = 3 * factorial(2)
2. factorial(2) = 3 * factorial(1)
3. factorial(1) = 1

From steps 2 and 3, we can say factorial(2) = 2 * 1 = 2; then when we apply the value from 
factorial(2)to step 1, we get factorial(3) = 3 * 2 * 1 = 6. Thus, we print 6 as our answer.
 */

public class Day9 {
	private static final Scanner scanner = new Scanner(System.in);

	static int factorial(int n) {
		if(n==0)
			return 1;
		else
			n=n*factorial(n-1);
		
		return n;
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int result = factorial(n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}