/*
 * Fibonacci.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Fibonacci.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.recursion;

public class Fibonacci {

	public int fibonacci(int i) {
		if (i <= 1) {
			return i;
		} else {
			return fibonacci(i-1) + fibonacci(i-2);
		}
	}
	
}

