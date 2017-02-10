/*
 * GenericClass.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* GenericClass.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections.generics;

import uk.ac.sheffield.com1003.collections.elements.Animal;
import uk.ac.sheffield.com1003.collections.elements.Lecturer;

public class GenericClass<T> {

	T obj; // declare an instance variable of class T
	
	public GenericClass(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
	
	void printClass() {
		System.out.println("Class parameter is "+obj.getClass().getName());
	}

	public static void main(String[] args) {
		GenericClass<Lecturer> l = 
				new GenericClass<Lecturer>(new Lecturer("Phil McMinn"));
		l.printClass();
		
		GenericClass<Animal> a = 
				new GenericClass<Animal>(new Animal("Dog"));
		a.printClass();
		
		GenericClass<Double> d = 
			new GenericClass<Double>(0.42);
		d.printClass();		
	}
}

