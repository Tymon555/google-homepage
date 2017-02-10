/*
 * Magazine.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Magazine.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.inheritance;

public class Magazine extends ReadingMatter {

	private String name, periodicity;
	
	public Magazine(int numPages, String name, String periodicity) {
		super(numPages);
		this.name = name;
		this.periodicity = periodicity;
	}
	
	public String getPeriodicity() {
		return periodicity;
	}
	
	public void printInfo() {
		System.out.println("Magazine. Name: " + name + ". " +
				           "Periodicity: " + periodicity + ". " +
				           "No. pages: " + getNumPages());
	}
}

