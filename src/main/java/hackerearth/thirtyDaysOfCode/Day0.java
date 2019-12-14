package hackerearth.thirtyDaysOfCode;

import java.util.Scanner;

/*

-----
Task 
-----
To complete this challenge, you must save a line of input from stdin to a variable, 
print Hello, World. on a single line, and finally print the value of your variable 
on a second line.

------------
Sample Input
------------
Welcome to 30 Days of Code!

-------------
Sample Output
-------------
Hello, World.
Welcome to 30 Days of Code!

*/
public class Day0 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		scanner.close();
		System.out.println("Hello, World.");
		System.out.println(inputString);
	}
}
