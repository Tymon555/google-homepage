/*
 * ToyCar.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* ToyCar.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.interfaces;

public class ToyCar extends Car 
					implements Toy {
	
	private int ageSuitableFor;
	
	public ToyCar(int numWheels, int numDoors, int ageSuitableFor) {
		super(numWheels, numDoors);
		this.ageSuitableFor = ageSuitableFor;
	}
	
	public int getAgeSuitableFor() {
		return ageSuitableFor;
	}
}



