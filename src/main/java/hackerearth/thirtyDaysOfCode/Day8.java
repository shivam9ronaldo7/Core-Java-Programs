package hackerearth.thirtyDaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
-----
Task 
-----
Given n names and phone numbers, assemble a phone book that maps friends' names to their 
respective phone numbers. You will then be given an unknown number of names to query your 
phone book for. For each name queried, print the associated entry from your phone book on a 
new line in the form name=phoneNumber; if an entry for name is not found, print Not found 
instead.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.

-------------
Sample Input
-------------
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

--------------
Sample Output
--------------
sam=99912222
Not found
harry=12299933

------------
Explanation
------------
We add the following n=3 (Key,Value) pairs to our map so it looks like this:
phoneBook={(sam,99912222),(tom,11122222),(harry,12299933)}

We then process each query and print key=value if the queried key is found in the map; 
otherwise, we print Not found.

Query 0: sam 
Sam is one of the keys in our dictionary, so we print sam=99912222.

Query 1: edward 
Edward is not one of the keys in our dictionary, so we print Not found.

Query 2: harry 
Harry is one of the keys in our dictionary, so we print harry=12299933.
*/

public class Day8 {
	static Scanner scanner = new Scanner(System.in);
	static Map<String, String> phoneBook = new HashMap<String,String>();
	
	public static void addPhoneBookEntry(String keyValue) {
		String key = keyValue.split(" ")[0];
		String value = keyValue.split(" ")[1];
		phoneBook.put(key, value);
	}
	
	public static void searchInPhoneBookEntry(String name) {
		if(phoneBook.containsKey(name))
			System.out.println(name+"="+phoneBook.get(name));
		else
			System.out.println("Not found");
	}
	
	public static void main(String[] args) {
		int nummberOfEntries = Integer.parseInt(scanner.nextLine());		
		for(int i=1; i<=nummberOfEntries;++i) {
			addPhoneBookEntry(scanner.nextLine());
		}
		while(scanner.hasNext()) {
			searchInPhoneBookEntry(scanner.nextLine());
		}
	}

}
