/*
 * EquilateralTriangle.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* EquilateralTriangle.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.abstractclasses;

import uk.ac.sheffield.com1003.EasyGraphics;

public class EquilateralTriangle extends Shape {

	private int sideLength;
	
	public EquilateralTriangle(int x, int y, int sideLength) {
		super(x, y);
		this.sideLength = sideLength;
	}
	
	public double getArea() {
		return Math.sqrt(3) / 4.0 * sideLength * sideLength;
	}
	
	public void draw(EasyGraphics g) {
		int halfSideLength = sideLength / 2;
		int sideLengthSquared = sideLength * sideLength;
		int halfSideSquared =  halfSideLength * halfSideLength;
		int height = (int) Math.sqrt(sideLengthSquared - halfSideSquared);
		
		g.drawLine(x, y, x-halfSideLength, y-height);
		g.drawLine(x, y, x+halfSideLength, y-height);
		g.drawLine(x-halfSideLength, y-height, x+halfSideLength, y-height);
	}	
}

