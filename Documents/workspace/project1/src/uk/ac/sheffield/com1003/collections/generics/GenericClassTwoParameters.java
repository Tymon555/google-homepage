/*
 * GenericClassTwoParameters.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* GenericClassTwoParameters.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections.generics;

public class GenericClassTwoParameters<T, V> {

	T obj1; // declare an instance variable of class T
	V obj2; // declare an instance variable of class V
	
	public GenericClassTwoParameters(T obj1, V obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	T getObj1() {
		return obj1;
	}
	
	V getObj2() {
		return obj2;
	}
}


