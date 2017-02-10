/*
 * CharacterFileExample.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* CharacterFileExample.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.io;

import java.io.*;

public class CharacterFileExample {

	private void writeFile(String filename, String data) throws IOException {
		FileOutputStream fos = new FileOutputStream(filename);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		osw.write(data);
		osw.close();  // closes the FileOutputStream too
	}
	
	private String readFile(String filename) throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		InputStreamReader isr = new InputStreamReader(fis);
		
		String stringRead = "";
		int charRead = isr.read();
		while (charRead != -1) {
			stringRead += (char) charRead;
			charRead = isr.read();
		}

		isr.close(); // closes the FileInputStream too
		
		return stringRead;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		CharacterFileExample cfe = new CharacterFileExample();
		cfe.writeFile("joke.txt", "How to prevent yourself from dying in your house? Stay in the living room");
		System.out.println(cfe.readFile("joke.txt"));
	}
	
}
