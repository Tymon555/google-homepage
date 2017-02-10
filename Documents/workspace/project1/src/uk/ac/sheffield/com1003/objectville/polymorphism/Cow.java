package uk.ac.sheffield.com1003.objectville.polymorphism;

/*
 * Cow.java  	1.1 20/12/2016
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Cow.java  
* 
* 
* @version 1.1 20/12/2016
* 
* @author Richard Clayton
*/

public class Cow extends Animal {

	public Cow( String name ){
		super( name );
	}
	
	public void talk(){
		System.out.println("Moo!");
	}
}
