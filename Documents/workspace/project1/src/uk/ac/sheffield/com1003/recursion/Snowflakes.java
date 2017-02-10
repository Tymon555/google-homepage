/*
 * Snowflakes.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Snowflakes.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.recursion;

import uk.ac.sheffield.com1003.EasyGraphics;

public class Snowflakes {

	int width, height;	
	EasyGraphics graphics;
	
	public Snowflakes(int width, int height) {
		this.width = width;
		this.height = height;
		graphics = new EasyGraphics(width, height);
	}
	
	void star(int xCentre, int yCentre, int radius, int recursions) {
		
		// horizontal line
		graphics.drawLine(xCentre-radius, yCentre, xCentre+radius, yCentre);
		
		// vertical line
		graphics.drawLine(xCentre, yCentre-radius, xCentre, yCentre+radius);
		
		// diagonal lines
		int diagonalDelta = (int) (Math.sqrt(2)/2 * radius);
		graphics.drawLine(xCentre - diagonalDelta, yCentre - diagonalDelta, xCentre + diagonalDelta, yCentre + diagonalDelta);
		graphics.drawLine(xCentre + diagonalDelta, yCentre - diagonalDelta, xCentre - diagonalDelta, yCentre + diagonalDelta);
		
		if (recursions > 0) {
			// turn it into a snowflake...
			recursions --;
			int newRadius = radius / 4;
			
			star(xCentre - radius, yCentre, newRadius, recursions);
			star(xCentre + radius, yCentre, newRadius, recursions);
			star(xCentre, yCentre - radius, newRadius, recursions);
			star(xCentre, yCentre + radius, newRadius, recursions);
			
			star(xCentre - diagonalDelta, yCentre - diagonalDelta, newRadius, recursions);
			star(xCentre + diagonalDelta, yCentre - diagonalDelta, newRadius, recursions);
			star(xCentre - diagonalDelta, yCentre + diagonalDelta, newRadius, recursions);
			star(xCentre + diagonalDelta, yCentre + diagonalDelta, newRadius, recursions);			
		}
	}
	
	void picture(int numStars, int maxRadius) {		
		for (int i=0; i < numStars; i++) {
			// choose a random centre point
			int xCentre = (int) (Math.random() * width);
			int yCentre = (int) (Math.random() * height);
			
			// choose a random radius
			int radius = (int) (Math.random() * maxRadius);
			
			// set random colour
			int r = (int) (Math.random() * 255);
			int g = (int) (Math.random() * 255);
			int b = (int) (Math.random() * 255);
			graphics.setColor(r, g, b);
			
			star(xCentre, yCentre, radius, 1);
		}
		
	}

	public static void main(String[] args) {
		Snowflakes s = new Snowflakes(500, 500);
		
		// one star
		//s.star(250, 250, 150, 5);
		
		// picture
		s.picture(75, 50);
	}
}
