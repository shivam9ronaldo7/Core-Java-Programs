package com.java.programs;

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
		
		Collections.sort(friendsList);
		
		for(Friends f:friendsList) {
			System.out.println(f.name+" ");
		}		
	}
}

//Here we are implementing Comparable iterface
class Friends implements Comparable<Friends>{
	String name;
	//Date dob;
	int weight;
	
	Friends(String name, int weight){
		this.name = name;
		//this.dob = dob;
		this.weight = weight;
	}

	@Override
	public int compareTo(Friends o) {
		return this.name.length()-o.name.length();		
	}
}

//Sorting using Comparator interface
//Created class to sort by name
class sortByName implements Comparator<Friends>{

	@Override
	public int compare(Friends o1, Friends o2) {
		return o1.name.length()-o2.name.length();
	}
	
}

//Created class to sort by weight
class sortByWeight implements Comparator<Friends>{

	@Override
	public int compare(Friends o1, Friends o2) {
		return o1.weight-o2.weight;
	}
	
}