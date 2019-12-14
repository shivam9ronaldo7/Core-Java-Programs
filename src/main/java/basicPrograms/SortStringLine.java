package basicPrograms;

import java.util.Arrays;

public class SortStringLine {

	public static void main(String[] args) {
		
		String text = "hello my name is shivam pratap singh";
		
		//Splits the text and stores it in an array
		String[] textArray = text.split(" ");
		
		//Sorts the array based on natural ordering
		Arrays.sort(textArray);
		
		System.out.println(Arrays.toString(textArray));
		
	}

}
