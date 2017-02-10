package uk.ac.sheffield.com1003.objectville.polymorphism;

/*
 * Animal.java  	1.1 20/12/2016
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Animal.java  
* 
* 
* @version 1.1 20/12/2016
* 
* @author Richard Clayton
*/

public class Animal {
	
	private String name;
	
	public Animal(String name){
		this.name = name;
	}
	
	public void talk() {
        System.out.println("Animals can't talk");
	}	

	public String getName(){
		return this.name;
	}
}
