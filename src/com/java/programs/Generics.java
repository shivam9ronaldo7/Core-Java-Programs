package com.java.programs;

import java.util.ArrayList;

/*
 * If we want this class data type to be used by a specific class or its subclass we
 * can use extend keyword.
*/
//Now if we want to use Container class we to pass class that extends only Number class
//or is a Number class and super is used to signify the super class
class Container<T extends Number>{
	T value;
	
	void show() {
		System.out.println(value.getClass().getName());
	}
	void list(ArrayList<? extends T> al) {
		System.out.println(al);
	}
}


public class Generics {
	public static void main(String[] args) {
		Container<Number> d = new Container<Number>();
		d.value=9;
		d.show();
		d.list(new ArrayList<Integer>());
	}
}
