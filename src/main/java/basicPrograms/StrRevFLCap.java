package basicPrograms;

import java.util.Scanner;

public class StrRevFLCap {

	public static void main(String[] args) {

		//Using scanner class to take input from user via keyboard
		Scanner keyInput = new Scanner(System.in);

		//Storing whole input line with converting it to upper case
		String userString =keyInput.nextLine().toUpperCase();

		//Closing the Scanner object
		keyInput.close();
		
		//Using StringBuffer to reverse the string and storing it
		//in a String variable 
		String userStringRev = new StringBuffer(userString).reverse().toString();
		
		//Splitting the string and storing it an array
		String[] userStringRevArray = userStringRev.split(" ");
		int textLength = 0;
		
		//for each loop for string manipulation
		for(String text:userStringRevArray) {			
			textLength=text.length();
			if(textLength>2) {
				text = Character.toString(text.charAt(0))+
						text.substring(1, textLength-1).toLowerCase()+
						Character.toString(text.charAt(textLength-1));
				
				System.out.print(text+" ");
			}else {
				System.out.print(text+" ");
			}
		}
	}
}
