/*
 * UsingDiamondOperator.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* UsingDiamondOperator.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import uk.ac.sheffield.com1003.collections.comparators.SurnameComparator;
import uk.ac.sheffield.com1003.collections.elements.Lecturer;

public class UsingDiamondOperator {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Java 7 introduced the diamond operator, meaning
		// we do not have specify the class parameter again
		// when constructing objects of a class using generics
		
		// Compare the following pairs of statements
		// with identical behaviour:
		
		ArrayList<String> lecturers1a = new ArrayList<String>();
		ArrayList<String> lecturers1b = new ArrayList<>();
		
		Set<Lecturer> lecturers2a = new HashSet<Lecturer>();
		Set<Lecturer> lecturers2b = new HashSet<>();
		
		Set<Lecturer> lecturers3a = new TreeSet<Lecturer>(new SurnameComparator());
		Set<Lecturer> lecturers3b = new TreeSet<>(new SurnameComparator());
		
		Map<Lecturer, String> phoneBook1 = new HashMap<Lecturer, String>();
		Map<Lecturer, String> phoneBook2 = new HashMap<>();
	}
}
