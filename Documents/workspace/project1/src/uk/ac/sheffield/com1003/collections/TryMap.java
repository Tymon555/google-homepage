/*
 * TryMap.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TryMap.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import uk.ac.sheffield.com1003.collections.elements.Lecturer;

public class TryMap {

	public static void main(String[] args) {
		
		Map<Lecturer, String> phoneBook = new HashMap<Lecturer, String>();
		
		phoneBook.put(new Lecturer("Phil"), "21826");
		phoneBook.put(new Lecturer("Guy"),  "21821");
		phoneBook.put(new Lecturer("Fax"),  "21810");
		
		// get Guy's phone number
		System.out.println(phoneBook.get(new Lecturer("Guy")));
		
		// remove Fax
		System.out.println(phoneBook.remove(new Lecturer("Fax")));
		
		// update Phil's number
		phoneBook.put(new Lecturer("Phil"), "21827");
		
		// iterate using the map's key set iterator
		Iterator<Lecturer> iterator = phoneBook.keySet().iterator();
		while (iterator.hasNext()) {
			Lecturer l = iterator.next();
			System.out.println(l.getName()+"'s phone extension is "+phoneBook.get(l));
		}
		
		// iterate "for-each" style:
		for (Lecturer l : phoneBook.keySet()) {
			System.out.println(l.getName()+"'s phone extension is "+phoneBook.get(l));
		}
	}
	
}
