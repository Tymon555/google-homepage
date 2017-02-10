/*
 * DirectoryExample.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* DirectoryExample.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.io;

import java.io.*;

public class DirectoryExample {
	
	public static void main(String[] args) {

		File currentDirectory = new File(".");		
		System.out.println("Investigating the contents of \"" + currentDirectory.getAbsolutePath() + "\"");		
		String[] entries = currentDirectory.list();

		for (String entry: entries) {
			File f = new File(currentDirectory.getAbsolutePath() + File.separator + entry);
			System.out.print("\"" + entry + "\" is ");
			if (f.isFile()) {
				System.out.println("a file.  Its size is " + f.length() + " bytes.");
			} else if (f.isDirectory()) {
				System.out.println("a directory.  It contains " + f.list().length + " items.");
			} else {
				System.out.println("something else.");
			}
		}
	}
}
