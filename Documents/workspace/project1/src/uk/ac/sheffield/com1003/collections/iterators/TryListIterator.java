/*
 * TryListIterator.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TryListIterator.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import uk.ac.sheffield.com1003.collections.elements.Lecturer;

public class TryListIterator {

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
		
		ListIterator<Lecturer> listIterator = lecturers.listIterator();
		
		while (listIterator.hasNext()) {
			int index = listIterator.nextIndex();
			Lecturer lecturer = listIterator.next();
			
			System.out.println(index+") "+lecturer.getName());
			
			if (lecturer.getName().equals("Phil McMinn")) {
				listIterator.add(new Lecturer("Mike Holcombe"));
				// go back one so that the added element is printed out 
				// in the next iteration
				listIterator.previous();
			}
		}	
	}
}
