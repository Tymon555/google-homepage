/*
 * Palindrome.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Palindrome.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.recursion;

public class Palindrome {

	public static boolean isPalindrome(String s) {
		
		if (s.length() <= 1) {
			return true;
		} else if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
			return true;
		} else if (s.length() > 2  && s.charAt(0) == s.charAt(s.length()-1)) {
			return isPalindrome(s.substring(1, s.length()-1));
		} 				
		
		return false;
	}
}

