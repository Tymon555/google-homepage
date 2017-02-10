/*
 * Newspaper.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Newspaper.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.inheritance;

public class Newspaper extends ReadingMatter {

	private String headline;
	
	public Newspaper(int numPages, String headline) {
		super(numPages);
		this.headline = headline;
	}
	
	public String getHeadline() {
		return headline;
	}
	
	public void printInfo() {
		System.out.println(
				"Newspaper. Headline: " + headline + ". " +
				"No. pages: "+getNumPages());
	}
}

