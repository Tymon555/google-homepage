/*
 * ReadingMatter.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* ReadingMatter.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.inheritance;

public class ReadingMatter {

	private int numPages;

	public ReadingMatter(int numPages) {
		this.numPages = numPages;
	}
	
	public int getNumPages() {
		return numPages;
	}
	
	public void printInfo() {
		System.out.println("ReadingMatter. Number of pages: "+numPages);
	}
}

