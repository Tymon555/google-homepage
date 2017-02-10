/*
 * BBCNewsHeadline.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* BBCNewsHeadline.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.io;

import java.io.IOException;

public class BBCNewsHeadline {

	public static void main(String[] args) {
		
		try {
			String contents = URLDownloader.urlContents("http://news.bbc.co.uk");
			
			String topStory = contents.substring(contents.indexOf("Top Stories"));			
			String link = topStory.substring(topStory.indexOf("<span class=\"title-link__title-text\"")+1);			
			String headline = link.substring(link.indexOf(">")+1, link.indexOf("<")).trim();
			
			System.out.println("The current BBC news headline is: \""+headline+"\"");
			
		} catch (IOException e) {
			System.out.println("There was an error: "+e.getMessage());
		}
	}
}

