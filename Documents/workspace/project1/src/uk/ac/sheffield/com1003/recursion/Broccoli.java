/*
 * Broccoli.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Broccoli.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.recursion;

import uk.ac.sheffield.com1003.EasyGraphics;

public class Broccoli {
	int width, height;	
	EasyGraphics graphics;
	
	public Broccoli(int width, int height) {
		this.width = width;
		this.height = height;
		graphics = new EasyGraphics(width, height);
	}
	
	void stem(int startX, int startY, int length, double angle, int recursions) {
		int endX = (int) (startX + (Math.sin(angle) * length));
		int endY = (int) (startY + (Math.cos(angle) * length));
		
		if (recursions > 0) {
			// set colour to green
			graphics.setColor(0, 200, 0);
		} else {
			// set colour to yellow
			graphics.setColor(250, 250, 210);
		}
		
		graphics.drawLine(startX, startY, endX, endY);
		
		if (recursions > 0) {
			length = (int) (length * 2/3.0);
			recursions --;
			stem(endX, endY, length, angle - 0.4, recursions);
			stem(endX, endY, length, angle, recursions);
			stem(endX, endY, length, angle + 0.4, recursions);
		}
	}
	
	public static void main(String[] args) {
		Broccoli b = new Broccoli(400, 400);
		b.stem(200, 25, 100, 0, 10);
	}	
}
