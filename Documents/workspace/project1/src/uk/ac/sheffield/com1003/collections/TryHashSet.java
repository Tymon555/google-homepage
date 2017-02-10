/*
 * TryHashSet.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TryHashSet.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections;

import java.util.HashSet;
import java.util.Set;

import uk.ac.sheffield.com1003.collections.elements.Lecturer;

public class TryHashSet {

	public static void main(String[] args) {
		
		Set<Lecturer> lecturers = new HashSet<Lecturer>();
		
		lecturers.add(new Lecturer("Georg Struth"));
		lecturers.add(new Lecturer("Moty Katzman"));
		lecturers.add(new Lecturer("Guy Brown"));
		lecturers.add(new Lecturer("Joab Winkler"));
		lecturers.add(new Lecturer("Phil McMinn"));
		
		for (Lecturer l : lecturers) {
			System.out.println(l.getName() +
					           " is in the set and his hash code is "+
					           l.hashCode());
		}
	}	
}
