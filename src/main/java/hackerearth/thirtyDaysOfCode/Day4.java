package hackerearth.thirtyDaysOfCode;

import java.util.Scanner;

/*
-----
Task 
-----
Write a Person class with an instance variable, age, and a constructor that takes an integer, 
initialAge, as a parameter. The constructor must assign initialAge to age after confirming 
the argument passed as initialAge is not negative; if a negative argument is passed as 
initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0.. 
In addition, you must write the following instance methods:
	1. yearPasses() should increase the  instance variable by 1.
	2. amIOld() should perform the following conditional actions:
		- If age<13, print You are young..
		- If age>=13 and age<18, print You are a teenager..
		- Otherwise, print You are old..
To help you learn by example and complete this challenge, much of the code is provided for 
you, but you'll be writing everything in the future. The code that creates each instance of 
your Person class is in the main method. Don't worry if you don't understand it all quite 
yet!
Note: Do not remove or alter the stub code in the editor.

-------------
Sample Input
-------------
4
-1
10
16
18

--------------
Sample Output
--------------
Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.

------------
Explanation
------------
Test Case 0: initialAge = -1 
Because initialAge<0, our code must set age to 0 and print the "Age is not valid..." 
message followed by the young message. Three years pass and age = 3, so we print the young 
message again.

Test Case 1: initialAge = 10
Because initialAge<13, our code should print that the person is young. Three years pass and 
age=13, so we print that the person is now a teenager.

Test Case 2: initialAge = 16
Because 13<=initialAge<18, our code should print that the person is a teenager. Three years 
pass and age = 19, so we print that the person is old.

Test Case 3: initialAge = 18
Because initialAge>=18, our code should print that the person is old. Three years pass and 
the person is still old at age = 21, so we print the old message again.
*/

public class Day4 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}

class Person {
	private int age;	  
	public Person(int initialAge) {
		age = initialAge;
		if(initialAge<0) {
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}
	public void amIOld() {
		if(age<13)
			System.out.println("You are young.");
		else if((age>=13)&&(age<18))
			System.out.println("You are a teenager.");
		else
			System.out.println("You are old.");
	}
	public void yearPasses() {
		++age;
	}
}
