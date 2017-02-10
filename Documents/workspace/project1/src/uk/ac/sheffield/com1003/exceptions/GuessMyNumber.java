/*
 * GuessMyNumber.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* GuessMyNumber.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.exceptions;

public class GuessMyNumber {

	private int number, min, max;
	
	public GuessMyNumber(int number, int min, int max) {
		this.number = number;
		this.min = min;
		this.max = max;
	}
	
	public void guess() {
		DigitGetter d = new DigitGetter(min, max);
		boolean gotGuess = false;
		
		while (!gotGuess) {
			try {
				System.out.println("Enter a number between "+min+" and "+max);
				int value = d.readDigit();
				
				gotGuess = true;
				if (value == number) {
					System.out.println("You guessed it - well done");
				}
			} catch (NotANumberException e) {
				System.out.println(e.getCharacter() + " is not a number!");
			} catch (OutOfRangeException e) {
				System.out.println(e.getValue() + " is out of range!");
			} 
		} 
		
		System.out.println("Bad guess - the number I was thinking of was "+number);
	}
	
	
	public static void main(String[] args) {
		GuessMyNumber g = new GuessMyNumber(3, 1, 6);
		g.guess();
	}
	
}
