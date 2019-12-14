package hackerearth.thirtyDaysOfCode;

import java.util.Scanner;

/*
-----
Task 
-----
Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and 
odd-indexed characters as  space-separated strings on a single line (see the Sample below 
for more detail).
Note: 0 is considered to be an even index.

-------------
Sample Input
-------------
2
Hacker
Rank

--------------
Sample Output
--------------
Hce akr
Rn ak

------------
Explanation
------------
Test Case 0: S = "Hacker"
 S[0] = "H"
 S[1] = "a"
 S[2] = "c"
 S[3] = "k"
 S[4] = "e"
 S[5] = "r"
The even indices are 0, 2, and 4, and the odd indices are 1, 3, and 5. We then print a 
single line of 2 space-separated strings; the first string contains the ordered characters 
from S's even indices (Hce), and the second string contains the ordered characters from S's odd 
indices (akr).

Test Case 1: S = "Rank"
 S[0] = "H"
 S[1] = "a"
 S[2] = "c"
 S[3] = "k" 
The even indices are 0 and 2, and the odd indices are 1 and 3. We then print a single line 
of 2 space-separated strings; the first string contains the ordered characters from S's 
even indices (Rn), and the second string contains the ordered characters from S's odd 
indices (ak).
*/

public class Day6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		String[] words = new String[count];
		for(int i = 0; i<count; ++i) {			
			words[i] = scanner.nextLine();
		}
		scanner.close();
		for(String word:words) {
			printLetter(word);
		}
	}
	
	public static void printLetter(String letter) {
		String firstString="";
		String secondString="";
		char[] letterCharacter = letter.toCharArray();
		for(int i = 0; i<letterCharacter.length; ++i) {
			if((i==0)||(i%2==0))
				firstString = firstString + letterCharacter[i];
			else
				secondString = secondString + letterCharacter[i];
		}
		System.out.print(firstString);
		System.out.print("  ");
		System.out.print(secondString);
		System.out.println("");
	}
}
