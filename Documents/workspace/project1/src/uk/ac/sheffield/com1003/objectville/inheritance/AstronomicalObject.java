/*
 * AstronomicalObject.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* AstronomicalObject.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.inheritance;

public class AstronomicalObject {
	
	private double magnitude;
	
	public AstronomicalObject(double magnitude) {
		this.magnitude = magnitude;
	}

	public double getMagnitude() {
		return magnitude;
	}
	
	public void printInfo() {
		System.out.println("Magnitude: "+magnitude);
	}
	
}


