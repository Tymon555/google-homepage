/*
 * Shape.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Shape.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.abstractclasses;

import uk.ac.sheffield.com1003.EasyGraphics;

public abstract class Shape {

	protected int x, y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}	
	
	public abstract double getArea();
	
	public abstract void draw(EasyGraphics g);
}


