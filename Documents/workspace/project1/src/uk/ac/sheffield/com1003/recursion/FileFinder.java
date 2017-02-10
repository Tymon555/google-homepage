/*
 * FileFinder.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* FileFinder.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.recursion;

import java.io.*;

public class FileFinder {

	public static void whereIs(String directoryName, String fileName) {
		
		String[] directoryContents = directoryContents(directoryName);
		
		for (String item : directoryContents) {
			String pathToItem = directoryName+"/"+item;
			
			if (fileName.equals(item)) {
				System.out.println("Found "+fileName+" in "+directoryName);
			} else if (isDirectory(pathToItem)) {
				whereIs(pathToItem, fileName);
			}
		}
	}
	
	private static String[] directoryContents(String directoryName) {
		return (new File(directoryName)).list();
	}
	
	private static boolean isDirectory(String fileName) {
		return (new File(fileName)).isDirectory();
	}
	
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: java FileFinder rootDirectory fileToFind");
			System.exit(1);
		}
		whereIs(args[0], args[1]);
	}
}
