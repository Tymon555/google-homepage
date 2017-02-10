/*
 * PrintStreamExample.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* PrintStreamExample.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.io;

import java.io.*;

public class PrintStreamExample {
	
	public static void main(String[] args) throws FileNotFoundException {

		String filename = "joke.txt";
		PrintStream ps = new PrintStream(filename);
		ps.println("Q: How to prevent yourself from dying in your house?");
		ps.println("A: Stay in the living room");
		ps.close();
		System.out.println("Now open " + filename + " in a text editor");
	}
}