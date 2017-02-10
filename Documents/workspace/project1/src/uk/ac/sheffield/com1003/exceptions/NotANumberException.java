/*
 * NotANumberException.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* NotANumberException.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.exceptions;

@SuppressWarnings("serial")
public class NotANumberException extends Exception {
	
	private char c;
	
	public NotANumberException(char c) {
		this.c = c;
	}
	
	public char getCharacter() {
		return c;
	}
}

