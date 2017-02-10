package uk.ac.sheffield.com1003.objectville.inheritance;

/*
 * Driver.java  	1.0 20/12/2016
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Driver.java
* 
* 
* @version 1.0 20/12/2016
* 
* @author Richard Clayton
*/

public class Driver extends Person {
	
	public Driver( int age ){
		super(age);
	}
	
	public boolean tooYoungToDrive(){
		if (age < 17)
			return true;
		else
			return false;
	}

}
