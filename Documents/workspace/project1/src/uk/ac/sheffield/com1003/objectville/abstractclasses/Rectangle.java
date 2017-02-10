/*
 * Rectangle.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Rectangle.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.abstractclasses;

import uk.ac.sheffield.com1003.EasyGraphics;

public class Rectangle extends Shape {

	private int width, height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y); 
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;		
	}
	
	public void draw(EasyGraphics g) {
		g.drawRectangle(x, y, width, height);	
	}	
}


