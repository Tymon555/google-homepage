/*
 * BinaryFileExample.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* BinaryFileExample.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.io; 

import java.io.*;

public class BinaryFileExample {
	
	public static void main(String[] args) throws IOException {
		String fileName = "binarydata";
		int[] data = {10, 20, 30};
		
		// open a file 
		FileOutputStream fos = new FileOutputStream(fileName);

		// write the data from the data array
		for (int byteToWrite: data) {
			fos.write(byteToWrite);
		}
	
		// close the stream
		fos.close();
	
		// now read the data back in with a FileInputStream
		FileInputStream fis = new FileInputStream(fileName);
		
		int readByte = fis.read();
		while (readByte != -1) {
			System.out.println("Read: "+readByte);
			readByte = fis.read();
		}
		
		// close the stream
		fis.close();
	}
}


