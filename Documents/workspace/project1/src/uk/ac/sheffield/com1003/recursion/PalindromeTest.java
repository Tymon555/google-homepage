/*
 * PalindromeTest.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* PalindromeTest.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.recursion;

import org.junit.*;
import static org.junit.Assert.*;

public class PalindromeTest {

	@Test
	public void emptyString() {
		assertTrue(Palindrome.isPalindrome(""));
	}	
	
	@Test
	public void oneCharacterString() {
		assertTrue(Palindrome.isPalindrome("o"));
	}

	@Test
	public void twoCharacterPalindrome() {
		assertTrue(Palindrome.isPalindrome("oo"));
	}
	
	@Test
	public void twoCharacterNonPalindrome() {
		assertFalse(Palindrome.isPalindrome("ox"));
	}	
	
	@Test
	public void threeCharacterPalindrome() {
		assertTrue(Palindrome.isPalindrome("oxo"));
	}
	
	@Test
	public void threeCharacterNonPalindrome() {
		assertFalse(Palindrome.isPalindrome("oox"));
	}
	
	@Test
	public void fourCharacterPalindrome() {
		assertTrue(Palindrome.isPalindrome("oxxo"));
	}
}
