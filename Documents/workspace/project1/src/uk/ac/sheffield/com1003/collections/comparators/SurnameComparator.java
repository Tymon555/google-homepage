/*
 * SurnameComparator.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* SurnameComparator.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections.comparators;

import java.util.Comparator;

import uk.ac.sheffield.com1003.collections.elements.Lecturer;

public class SurnameComparator implements Comparator<Lecturer> {
	
	public int compare(Lecturer someLecturer, Lecturer someOtherLecturer) {
		// use string's comparator on the lecturer's surnames
		return someLecturer.getSurname().compareTo(someOtherLecturer.getSurname());
	}
}


