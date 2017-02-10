/*
 * TooHighException.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TooHighException.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.exceptions;

@SuppressWarnings("serial")
public class TooHighException extends OutOfRangeException {

	public TooHighException(int value) {
		super(value);	
	}	
}

