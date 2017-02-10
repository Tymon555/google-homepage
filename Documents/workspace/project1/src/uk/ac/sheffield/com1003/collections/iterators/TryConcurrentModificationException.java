/*
 * TryConcurrentModificationException.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TryConcurrentModificationException.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import uk.ac.sheffield.com1003.collections.elements.Lecturer;

public class TryConcurrentModificationException {

	public static void main(String[] args) {
		
		List<Lecturer> lecturers = new ArrayList<Lecturer>();
		
		lecturers.add(new Lecturer("Georg Struth"));
		lecturers.add(new Lecturer("Moty Katzman"));
		lecturers.add(new Lecturer("Guy Brown"));
		lecturers.add(new Lecturer("Joab Winkler"));
		lecturers.add(new Lecturer("Phil McMinn"));
		lecturers.add(new Lecturer("Steve Maddock"));
		lecturers.add(new Lecturer("Mike Stannett"));
		lecturers.add(new Lecturer("Siobhan North"));
		lecturers.add(new Lecturer("Marian Gheorghe"));
		
		Iterator<Lecturer> iterator = lecturers.listIterator();
		
		while (iterator.hasNext()) {
			Lecturer lecturer = iterator.next();
			
			if (lecturer.getName().equals("Phil McMinn")) {
				// Add an element to the end of the list.
				// We're not doing this using iterator, but by
				// using the list directly.  This will trigger
				// a ConcurrentModificationException and crash
				// the program.
				lecturers.add(new Lecturer("Mike Holcombe"));
			}
			
			System.out.println(lecturer.getName());			
		}	
	}	
	
}
