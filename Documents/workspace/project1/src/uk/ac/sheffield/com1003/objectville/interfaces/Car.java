/*
 * Car.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Car.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.interfaces;

public class Car {
	
	private int numDoors, numWheels;
	
	public Car(int numDoors, int numWheels) {
		this.numDoors = numDoors;
		this.numWheels = numWheels;
	}
	
	public int getNumDoors() {
		return numDoors;
	}	
	
	public int getNumWheels() {
		return numWheels;
	}
}


