/*
 * ClassWithGenericMethods.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* ClassWithGenericMethods.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections.generics;

public class ClassWithGenericMethods {

	public <N> void print(N obj) {
		// print something 
	}
	
	public <N extends Number> void print(N obj) {
		// print something 
	}	
	
	public <N> void print(GenericClass<?> obj) {
		// print something 
	}
	
	public <N> void print2(GenericClass<? extends Number> obj) {
		// print something 
	}	
}


