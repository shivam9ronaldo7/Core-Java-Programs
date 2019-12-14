package basicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
-----
Task
-----
Write a program to find the string which satisfies the below two conditions:
	1. Every character in the given string should be persent in the comparing string i.e.
	   present in the list.
	2. No two character in the comparing string should be repetitive.

------
Input
------
ABCD
[ABCDZ,ABABCD,AABCDBBCD]

-------
Output
-------
[ABABCD]

------------
Explanation
------------
character = ABCD
strings = [ABCDZ,ABABCD,AABCDBBCD]

ABCDZ is rejected as it contains 'Z' as an extra character

ABABCD is accepted as it contains all the character of 'ABCD', no extra and no two 
characters of this string is repetitive

AABCDBBCD is rejected as it satisfys the 1st condtion but it contains repetitve character 
i.e. AA & BB is repetitive.
 */

public class CharRepetition {

	public static String[] findResult(String character, String[] strings) {
		String[] tempArray;
		ArrayList<String> resultList = new ArrayList<String>();
		ArrayList<String> tempResultList = new ArrayList<String>();
		HashSet<String> temp = null;
		HashSet<String> charSet = new HashSet<String>(Arrays.asList(character.split("")));

		//Condition to check if both string are having same contents
		for(String string:strings) {
			temp = new HashSet<String>(Arrays.asList(string.split("")));
			if(charSet.equals(temp))
				tempResultList.add(string);
		}

		//Condition to check repetition of character
		for(String string: tempResultList) {
			tempArray = string.split("");
			int counter = 0;
			for(int i=0; i<tempArray.length-1; ++i) {
				if(tempArray[i].equals(tempArray[i+1]))
					++counter;
			}
			if(counter==0)
				resultList.add(string);
		}

		return resultList.toArray(new String[resultList.size()]);		
	}

	public static String[] findResultWithoutCollection(String character, String[] strings) {
		String[] tempArray = new String[1];
		int counter = 0;
		//Condition to check if both string are having same contents
		for(String string: strings) {
			System.out.println(string);
			System.out.println(uniqueStrings(character).equals(uniqueStrings(string)));			
			if(uniqueStrings(character).equals(uniqueStrings(string))) {
				tempArray[counter] = string;
				++counter;
				Arrays.copyOf(tempArray, counter);
			}				
		}		
		return tempArray;		
	}

	public static String uniqueStrings(String string) {
		StringBuffer sb = new StringBuffer(string);	
		String str = null;
		for(int i=0; i<sb.length(); ++i) {
			for(int j=i+1; j<sb.length(); ++j) {
				if(sb.charAt(i)==sb.charAt(j)) {
					System.out.println(sb.charAt(j));
					sb.deleteCharAt(j);
				}
			}
		}
		str = sb.toString();
		System.out.println(str);	
		char temp;
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; ++i) {
			for(int j=i+1; j<arr.length; ++j) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return String.valueOf(arr);		
	}

	public static void main(String[] args) {
		String character = "AABCDBBCD"/*"ABCDD"*/;
		/*String[] strings = {"ABCDZ","ABABCD","AABCDBBCD"};
		String[] result = findResultWithoutCollection(character, strings);
		System.out.println(Arrays.toString(result));*/
		System.out.println(uniqueStrings(character));
	}

}
