/*
 * OneButtonFrame.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* OneButtonFrame.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.guis;

import java.awt.Container;
import javax.swing.JButton;

import uk.ac.sheffield.com1003.graphics.CentredFrame;
																		
@SuppressWarnings("serial")
public class OneButtonFrame extends CentredFrame {

	public OneButtonFrame() {
		setTitle("Centred Frame with a Button");
		
		// instantiate a button
		JButton button = new JButton("Press me");
		
		// add it to the JFrame
		Container contentPane = getContentPane();		
		contentPane.add(button);
	}
	
	public static void main(String[] args) {
		OneButtonFrame oneButtonFrame = new OneButtonFrame();
		oneButtonFrame.setVisible(true);
	}	
}
																		
																		
