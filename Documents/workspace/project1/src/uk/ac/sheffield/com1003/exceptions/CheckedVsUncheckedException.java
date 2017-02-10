/*
 * CheckedVsUncheckedException.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* CheckedVsUncheckedException.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.exceptions;

public class CheckedVsUncheckedException {

	// throw an unchecked exception
	public void arrayIndexOutOfBounds() {
		
		int[] x = {1, 2, 3};
		
		// an ArrayIndexOutOfBoundsException will be thrown: 
		System.out.println(x[4]);
	}
	
	public void handleUncheckedException() {
		
		try {
			arrayIndexOutOfBounds();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught the exception");
		}
		
		// but we are not forced to catch it:
		arrayIndexOutOfBounds();
	}
	
	// checked exception
	public void notANumber() throws NotANumberException {
		
		throw new NotANumberException('a');
	}	
	
	public void handleCheckedException() {
		
		// we must handle this exception, otherwise our program
		// will not compile
		try {
			notANumber();
		} catch (NotANumberException e) {
			System.out.println("Caught the exception");
		}
		
	}	
	
	public static void main(String[] args) {
		new CheckedVsUncheckedException().handleUncheckedException();
	}
}
