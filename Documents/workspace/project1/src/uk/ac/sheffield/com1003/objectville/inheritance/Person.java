package uk.ac.sheffield.com1003.objectville.inheritance;

/*
 * Person.java  	1.0 20/12/2016
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

public class Person {
	
	protected int age;

	public Person( int age ){
		this.age = age;
	}
	
	public int ageInYears(){
		return age;
	}

}
