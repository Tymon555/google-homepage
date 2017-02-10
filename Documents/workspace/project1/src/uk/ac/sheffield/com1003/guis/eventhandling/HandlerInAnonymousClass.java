/*
 * HandlerInAnonymousClass.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* HandlerInAnonymousClass.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.guis.eventhandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import uk.ac.sheffield.com1003.graphics.CentredFrame;

@SuppressWarnings("serial")
public class HandlerInAnonymousClass extends CentredFrame {

	JButton button;
	String[] labels = {"Click me", "Click me again"};
	int currentLabel = 0;
	
	public HandlerInAnonymousClass() {
		
		button = new JButton(labels[0]);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentLabel ++;
				if (currentLabel >= labels.length) {
					currentLabel = 0;
				}
				button.setText(labels[currentLabel]);
			}			
		});
		
		setTitle("Handler in anonymous class");
		getContentPane().add(button);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new HandlerInAnonymousClass();
	}
}

