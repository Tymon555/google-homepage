/*
 * TooLowException.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TooLowException.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.exceptions;

@SuppressWarnings("serial")
public class TooLowException extends OutOfRangeException {

	public TooLowException(int value) {
		super(value);
	}	
}

