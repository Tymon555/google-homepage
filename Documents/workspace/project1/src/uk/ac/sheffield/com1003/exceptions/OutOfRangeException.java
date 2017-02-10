/*
 * OutOfRangeException.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* OutOfRangeException.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.exceptions;

@SuppressWarnings("serial")
public class OutOfRangeException extends Exception {

	private int value;
	
	public OutOfRangeException(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
