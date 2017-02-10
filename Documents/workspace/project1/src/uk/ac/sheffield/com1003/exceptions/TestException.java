/*
 * TestException.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TestException.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.exceptions;

import org.junit.*;

public class TestException {

	CheckedVsUncheckedException c = new CheckedVsUncheckedException();
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testArrayIndexOutOfBounds() {
		c.arrayIndexOutOfBounds();
	}
	
	@Test(expected=NotANumberException.class)
	public void testNotANumberException() throws NotANumberException {
		c.notANumber();
	}		
}


