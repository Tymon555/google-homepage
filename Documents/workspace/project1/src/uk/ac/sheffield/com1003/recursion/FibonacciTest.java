/*
 * FibonacciTest.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* FibonacciTest.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.recursion;

import org.junit.*;
import static org.junit.Assert.*;

public class FibonacciTest {

	Fibonacci f = new Fibonacci();
	
	@Test
	public void baseCase() {
		assertEquals(1, f.fibonacci(1));
	}
	
	@Test
	public void recursiveCase() {
		assertEquals(8, f.fibonacci(6));
	}
	
}
