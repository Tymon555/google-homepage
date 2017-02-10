/*
 * PrintDownFrom.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* PrintDownFrom.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.recursion;

public class PrintDownFrom {

	void printDownFrom(int i) {
		System.out.println(i);
		if (i > 1) {
			printDownFrom(i-1);
		}
	}
	
	public static void main(String[] args) {
		PrintDownFrom p = new PrintDownFrom();
		p.printDownFrom(10);
	}
	
}
