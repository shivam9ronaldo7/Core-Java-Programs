package basicPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTechniques{

	public static void main(String[] args) {

		List<Friends> friendsList = new ArrayList<Friends>();
		friendsList.add(new Friends("Gullu", 90));
		friendsList.add(new Friends("Bulluuu", 99));
		friendsList.add(new Friends("Mulluu", 47));

		//Sorting on using Comparable interface
		System.out.println("Sorting on using Comparable interface");
		Collections.sort(friendsList);		
		for(Friends f:friendsList) {
			System.out.println(f.name+" ");
		}

		//Sorting on using Comparator interface
		System.out.println("Sorting on using Comparator interface with Anonymous Inner Class");
		Collections.sort(friendsList, new Comparator<Friends>() {
			@Override
			public int compare(Friends o1, Friends o2) {
				return o1.weight-o2.weight;
			}
		});
		for(Friends f:friendsList) {
			System.out.println(f.name+" ");
		}

		//Sorting on using Comparator interface
		System.out.println("Sorting on using Comparator interface with Lambda Expression");
		Collections.sort(friendsList, (o1,o2)->o1.weight-o2.weight);
		for(Friends f:friendsList) {
			System.out.println(f.name+" ");
		}

		//Sorting on using Comparator interface
		System.out.println("Sorting on using Comparator interface with Method Reference");
		Collections.sort(friendsList, new Friends()::compare);
		for(Friends f:friendsList) {
			System.out.println(f.name+" ");
		}
	}
}

//Here we are implementing Comparable interface
class Friends implements Comparable<Friends>, Comparator<Friends>{
	String name;
	//Date dob;
	int weight;
	
	Friends(){}
	
	Friends(String name, int weight){
		this.name = name;
		//this.dob = dob;
		this.weight = weight;
	}

	@Override
	public int compareTo(Friends o) {
		return this.name.length()-o.name.length();		
	}

	@Override
	public int compare(Friends o1, Friends o2) {
		return o1.weight-o2.weight;
	}
}