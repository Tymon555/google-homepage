/*
 * Squares.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Squares.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.recursion;

import uk.ac.sheffield.com1003.EasyGraphics;

public class Squares {

	int width, border;
	EasyGraphics graphics;

	public Squares(int width, int border) {
		this.width = width;
		this.border = border;
		graphics = new EasyGraphics(width + border, width + border);
	}

	public void draw(int recursions) {
		square((width + border)/2, (width + border)/2, width/4, recursions);
	}

	void square(int xCentre, int yCentre, int radius, int recursions) {
		int x1, y1, x2, y2, newRadius;

		// figure out the actual co-ordinates based on
		// xCentre, yCentre and radius
		x1 = xCentre - radius;
		x2 = xCentre + radius;
		y1 = yCentre - radius;
		y2 = yCentre + radius;

		// draw a square
		graphics.moveTo(x1, y1);
		graphics.lineTo(x1, y2);
		graphics.lineTo(x2, y2);
		graphics.lineTo(x2, y1);
		graphics.lineTo(x1, y1);

		if (recursions > 0) {
			// draw a new square in each corner of half the radius
			newRadius = radius / 2;
			square(x1, y1, newRadius, recursions - 1);
			square(x1, y2, newRadius, recursions - 1);
			square(x2, y1, newRadius, recursions - 1);
			square(x2, y2, newRadius, recursions - 1);
		}
	}

	public static void main(String[] args) {
		Squares s = new Squares(400, 50);
		s.draw(10);
	}
}
