/*
 * URLDownloader.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* URLDownloader.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLDownloader {

	public static String urlContents(String urlString) throws IOException {
		
		URL url = new URL(urlString);
		
		BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String contents = "";
		String line = r.readLine();
		while (line != null) {
			contents += line;
			line = r.readLine();
		}
		
		return contents;
	}
	
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Please supply a URL");
			System.exit(1);
		}
		
		String urlString = args[0];		
		System.out.println("These are the contents of the URL "+urlString+":");
		
		try {
			System.out.println(urlContents(urlString));
		} catch (IOException e) {
			System.out.println("There was an error: "+e.getMessage());
		}
	}
	
}
