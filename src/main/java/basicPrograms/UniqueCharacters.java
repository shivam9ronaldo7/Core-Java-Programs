package basicPrograms;

import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {
		//Creating a scanner object to take values from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the characters with ',' as split element");
		
		//Storing the text given by user in a string and splitting the array
		String[] strArray = sc.nextLine().split(",");
		
		//Closing the scanner object
		sc.close();
		
		int arrSize = strArray.length;		
		System.out.println("Unique elements are: ");
		
		//for loop to iterate over each element
		for(int i = 0; i<arrSize ; ++i) {			
			//for loop to check element equality
			int j;
			for(j = 0 ; j<i ; ++j) {				
				if(strArray[i].equals(strArray[j]))
					break;
			}			
			if(i==j)
				System.out.print(strArray[i]);
		}		
	}
}
