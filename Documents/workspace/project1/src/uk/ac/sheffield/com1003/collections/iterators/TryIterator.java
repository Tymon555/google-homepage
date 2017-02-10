/*
 * TryIterator.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TryIterator.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections.iterators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import uk.ac.sheffield.com1003.collections.elements.Lecturer;

public class TryIterator {

	public static void main(String[] args) {
		
		Collection<Lecturer> lecturers = new ArrayList<Lecturer>();
		
		lecturers.add(new Lecturer("Georg Struth"));
		lecturers.add(new Lecturer("Moty Katzman"));
		lecturers.add(new Lecturer("Guy Brown"));
		lecturers.add(new Lecturer("Joab Winkler"));
		lecturers.add(new Lecturer("Phil McMinn"));
		lecturers.add(new Lecturer("Steve Maddock"));
		lecturers.add(new Lecturer("Mike Stannett"));
		lecturers.add(new Lecturer("Siobhan North"));
		lecturers.add(new Lecturer("Marian Gheorghe"));
		
		Iterator<Lecturer> iterator = lecturers.iterator();
		
		while (iterator.hasNext()) {
			Lecturer lecturer = iterator.next();
			
			if (lecturer.getName().equals("Joab Winkler")) {
				iterator.remove();
			}
			
			System.out.println(lecturer.getName());
		}
	}
}
