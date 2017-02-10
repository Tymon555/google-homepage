/*
 * SimpleFrame2.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* SimpleFrame2.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.graphics;

import java.awt.Container;
import javax.swing.JFrame;

@SuppressWarnings("serial")

// This class adds a JPanel to the JFrame so that we can draw in it

public class SimpleFrame2 extends JFrame {
	
	public SimpleFrame2(){
	
		// add title and set size
		setTitle("A Simple Frame 2");
		setSize(600, 400);

		// get reference to the content pane of this object,
		// create a drawing panel, and add to the content pane
		Container contentPane = this.getContentPane();
		SimplePanel myDrawing = new SimplePanel();
		contentPane.add(myDrawing);
	
		}
	
	public static void main(String[] args) {
		SimpleFrame2 drawFrame = new SimpleFrame2();

		drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawFrame.setVisible(true);
	}
	
}
