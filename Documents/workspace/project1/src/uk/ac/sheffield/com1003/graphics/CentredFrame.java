/*
 * CenteredFrame.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* CenteredFrame.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.graphics;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;

@SuppressWarnings("serial")

public class CentredFrame extends JFrame {

	public CentredFrame() {
		setTitle("A Centred Frame");
		
		// A Toolkit lets us retrieve system information.
		// Find out more about it in the JavaDocs.
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		Dimension screenDimensions = toolkit.getScreenSize();
		setSize(screenDimensions.width/2, screenDimensions.height/2);		
		setLocation(new Point(screenDimensions.width/4, screenDimensions.height/4));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		CentredFrame centredFrame = new CentredFrame();
		centredFrame.setVisible(true);
	}
}

																								