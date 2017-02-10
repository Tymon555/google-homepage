package uk.ac.sheffield.com1003.objectville.polymorphism;

/*
 * Dog.java  	1.1 20/12/2016
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Dog.java  
* 
* 
* @version 1.1 20/12/2016
* 
* @author Richard Clayton
*/

public class Dog extends Animal {

	public Dog( String name ){
		super( name );
	}
	
	public void talk(){
		System.out.println("Woof!");
	}
	
}
