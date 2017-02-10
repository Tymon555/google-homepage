/*
 * DrawShapes.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* DrawShapes.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.abstractclasses;

import uk.ac.sheffield.com1003.EasyGraphics;

public class DrawShapes {

	public static void main(String[] args) {
		EasyGraphics g = new EasyGraphics(200, 200);
		
		Shape[] shapes = {new Rectangle(10, 10, 75, 50),
						  new Rectangle(50, 75, 50, 50),
						  new EquilateralTriangle(165, 175, 50)};
		
		for (int i=0; i < shapes.length; i++) {
			shapes[i].draw(g);
		}		
	}	
}
