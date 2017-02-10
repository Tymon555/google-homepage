/*
 * FileExample.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* FileExample.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.io;

import java.io.*;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File f = new File("mission-impossible.txt");
		
		if (!f.exists()) {
			PrintWriter pw = new PrintWriter(f);
			pw.println("This message will self-destruct in less than a millisecond");
			pw.close();
		
			boolean result = f.delete();
			if (!result) {
				System.out.println("Could not delete the file!");
			}
		}
	}
}

