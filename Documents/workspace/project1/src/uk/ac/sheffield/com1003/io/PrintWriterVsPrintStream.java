/*
 * PrintWriterVsPrintStream.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* PrintWriterVsPrintStream.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/


package uk.ac.sheffield.com1003.io;

import java.io.*;

public class PrintWriterVsPrintStream {
	
	public static void main(String[] args) throws IOException {
		
		String psFileName = "printstream.txt";
		String pwFileName = "printwriter.txt";
				
		System.out.println("I am going to demonstrate the difference between "+
						   "PrintStream and PrintWriter.");
		PrintStream ps = new PrintStream(psFileName);
		PrintWriter pw = new PrintWriter(pwFileName);

		System.out.print("I am now going to perform lots of little writes:");
		String[] data = {"Fox and Duck", "Grindstone", "Ball", "Devonshire Cat",
						 "Sportsman", "Three Merry Lads", "Fox House",
						 "Ranmoor Inn", "Three Tuns", "Fat Cat"};

		for (String s: data) {
			ps.println(s);
			pw.println(s);
		}
		
		System.out.println("finished.\nNow open " + psFileName + " and " + pwFileName + 
						   " in a text editor and compare the difference.  " + 
						   "Press return when you're done.");
						
		System.in.read();				
		
		// the all important flush:
		pw.flush();
						
		System.out.println("Now close the files and open them files again.  Have a nice day!");
		
		ps.close();
		pw.close();
	}
}
