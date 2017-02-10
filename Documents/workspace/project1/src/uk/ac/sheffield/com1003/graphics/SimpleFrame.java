/*
 * SimpleFrame.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* SimpleFrame.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SimpleFrame extends JFrame {
														
	public SimpleFrame() {
		setTitle("A Simple Frame");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SimpleFrame();
	}
}


