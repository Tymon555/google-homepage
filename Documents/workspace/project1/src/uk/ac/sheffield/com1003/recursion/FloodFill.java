/*
 * FloodFill.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* FloodFill.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.recursion;

import uk.ac.sheffield.com1003.EasyGraphics;

public class FloodFill {
	int width, height;	
	int r, g, b;
	EasyGraphics graphics;
	
	public FloodFill(int width, int height, int r, int g, int b) {
		this.width = width;
		this.height = height;
		graphics = new EasyGraphics(width, height);
		
		this.r = r;
		this.g = g;
		this.b = b;
		graphics.setColor(r, g, b);	
	}
	
	void drawRandomCircles(int number, int radius) {
		for (int i=0; i < number; i++) {
			int x = (int) (Math.random() * width);
			int y = (int) (Math.random() * height);
			graphics.drawEllipse(x-radius/2, y-radius/2, radius, radius); 
		}		
	}
	
	void doRandomFills(int number) {		
		for (int i=0; i < number; i++) {
			int x = (int) (Math.random() * width);
			int y = (int) (Math.random() * height);
			fill(x, y); 
		}		
	}
	
	void fill(int x, int y) {
		
		if (x >= 0 && y >= 0 && x < width && y < height) {
			
			if (r != graphics.getRed(x, y) || 
					g != graphics.getGreen(x, y) || 
					b != graphics.getBlue(x, y)) {
				
				graphics.plot(x, y);
				
				fill(x+1, y);
				fill(x-1, y);
				fill(x, y+1);
				fill(x, y-1);
			}
		}
	}
	
	public static void main(String[] args) {
		FloodFill f = new FloodFill(500, 500, 255, 0, 0);
		f.drawRandomCircles(200, 50);
		f.doRandomFills(100);
	}
}
