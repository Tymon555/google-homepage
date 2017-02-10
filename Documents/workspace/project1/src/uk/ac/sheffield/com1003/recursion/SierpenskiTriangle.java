/*
 * SierpenskiTriangle.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* SierpinskiTriangle.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/
package uk.ac.sheffield.com1003.recursion;

import uk.ac.sheffield.com1003.EasyGraphics;

public class SierpenskiTriangle {

	int width, height, border;
	EasyGraphics graphics;
	
	public SierpenskiTriangle(int width, int height, int border) {
		this.width = width;
		this.height = height;
		this.border = border;
		graphics = new EasyGraphics(width + border, height + border);		
	}
	
	public void draw(int recursions) {
		triangle((width + border) / 2, height + (border / 2),
				 border / 2, border / 2, 
				 width + (border / 2), (border / 2), 
				 recursions);
	}
	
	void triangle(int x1, int y1, int x2, int y2, int x3, int y3, int recursions) {
		
		if (recursions == 0) {
			// draw the triangle
			graphics.drawLine(x1, y1, x2, y2); 
			graphics.drawLine(x2, y2, x3, y3);
			graphics.drawLine(x3, y3, x1, y1);
		} else {
			// make 3 new triangles by connecting the midpoints of the
			// previous triangle
			int xa, ya, xb, yb, xc, yc; 
										
			xa = (x1 + x2) / 2;
			ya = (y1 + y2) / 2;
			xb = (x1 + x3) / 2;
			yb = (y1 + y3) / 2;
			xc = (x2 + x3) / 2;
			yc = (y2 + y3) / 2;
			
			// recursively call the method using the coordinates of the
			// three triangles
			triangle(x1, y1, xa, ya, xb, yb, recursions - 1); 
			triangle(xa, ya, x2, y2, xc, yc, recursions - 1);
			triangle(xb, yb, xc, yc, x3, y3, recursions - 1);
		}
	}

	public static void main(String[] args) {
		SierpenskiTriangle s = new SierpenskiTriangle(650, 500, 50);
		s.draw(10);
	}
}