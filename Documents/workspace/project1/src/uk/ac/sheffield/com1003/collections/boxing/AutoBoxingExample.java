/*
 * AutoBoxingExample.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* AutoBoxingExample.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections.boxing;

import java.util.ArrayList;

public class AutoBoxingExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		
		int unboxedValue = l.get(0);
		
		System.out.println(unboxedValue);
	}
}

