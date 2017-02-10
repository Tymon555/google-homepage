/*
 * Star.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Star.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.inheritance;

public class Star extends AstronomicalObject {

	private double surfaceTemperature;
	
	public Star(double magnitude, double surfaceTemperature) {
		super(magnitude);
		this.surfaceTemperature = surfaceTemperature;
	}

	public double getSurfaceTemperature() {
		return surfaceTemperature;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Surface Temperature: "+surfaceTemperature);
	}
}


