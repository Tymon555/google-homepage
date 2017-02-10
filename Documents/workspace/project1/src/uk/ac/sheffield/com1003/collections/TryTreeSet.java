/*
 * TryTreeSet.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TryTreeSet.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections;

import java.util.Set;
import java.util.TreeSet;

import uk.ac.sheffield.com1003.collections.comparators.SurnameComparator;
import uk.ac.sheffield.com1003.collections.elements.Lecturer;

public class TryTreeSet {

	public static void main(String[] args) {
		
		Set<Lecturer> lecturers = new TreeSet<Lecturer>(new SurnameComparator());
		
		lecturers.add(new Lecturer("Georg Struth"));
		lecturers.add(new Lecturer("Moty Katzman"));
		lecturers.add(new Lecturer("Guy Brown"));
		lecturers.add(new Lecturer("Joab Winkler"));
		lecturers.add(new Lecturer("Phil McMinn"));
		
		System.out.println(lecturers.contains(new Lecturer("Phil McMinn")));
		System.out.println(lecturers.contains(new Lecturer("Mike Holcombe")));
	}
}
