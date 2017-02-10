/*
 * Book.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Book.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.inheritance;

public class Book extends ReadingMatter {

	private String name, author;
	
	public Book(int numPages, String name, String author) {
		super(numPages);
		this.name = name;
		this.author = author;
	}
	
	public void printInfo() {
		System.out.println(
				"Book. Name: " + name + ". " + 
				"Author: " + author + ". " + 				           
				"No. pages: " + getNumPages());
	}
}

