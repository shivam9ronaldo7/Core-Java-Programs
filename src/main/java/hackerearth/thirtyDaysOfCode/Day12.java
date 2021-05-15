package hackerearth.thirtyDaysOfCode;

import java.util.Scanner;

/*
----
Task
----
You are given two classes, Person and Student, where Person is the base class and Student is the derived class. 
Completed code for Person and a declaration for Student are provided for you in the editor. 
Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

* A Student class constructor, which has  parameters:
	1. A string, firstName.
	2. A string, lastName.
	3. An integer, id.
	4. An integer array (or vector) of test scores, scores.
* A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:

Grading scale
Letter|Average(a)
O|90<=a<=100
E|80<=a<90
A|70<=a<80
P|55<=a<=70
D|40<=a<=55
T|a<40

------------
Input Format
------------
The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments. It also calls the calculate method (which takes no arguments).

You are not responsible for reading the following input from stdin:
The first line contains firstName, lastName, and id, respectively. The second line contains the number of test scores. The third line of space-separated integers describes scores.

-----------
Constraints
-----------
Output Format
* 1<=|firstName|,|lastName|<=10
* |id|=7
* 

------------
Sample Input
------------
Heraldo Memelli 8135627
2
100 80

-------------
Sample Output
-------------
Name: Memelli, Heraldo
ID: 8135627
Grade: O

-----------
Explanation
-----------
This student had 2 scores to average: 100 and 80. The student's average grade is ((100+80)/2)=90. An average grade of 90 corresponds to the letter grade O, 
so our calculate() method should return the character'O'.
*/

public class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}

class Persons {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Persons(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Persons{
	private int[] testScores;

    Student(String firstName, String lastName, int id, int[] testScores) {
    	super(firstName, lastName, id);
    	this.testScores = testScores;
    }
    
    public String calculate() {
    	int total = 0;
    	for(int score: testScores) {
    		total += score;
    	}
    	int average = total/testScores.length;
    	if((average<=100)&&(average>=90)) {
    		return "O";
    	} else if((average<90)&&(average>=80)) {
    		return "E";
    	} else if((average<80)&&(average>=70)) {
    		return "A";
    	} else if((average<70)&&(average>=55)) {
    		return "P";
    	} else if((average<55)&&(average>=40)) {
    		return "D";
    	} else {
    		return "T";
    	}
    }
}
