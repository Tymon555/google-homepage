/*
 * HandlerInDifferentClass.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* HandlerInDifferentClass.java
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
public class HandlerInDifferentClass extends CentredFrame {

	JButton button;
	String[] labels = {"Click me", "Click me again"};
	int currentLabel = 0;
	
	public HandlerInDifferentClass() {
		
		button = new JButton(labels[0]);
		button.addActionListener(new ButtonHandler(button, labels, 0));
		
		setTitle("Handler in different class");
		getContentPane().add(button);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new HandlerInDifferentClass();
	}
}

class ButtonHandler implements ActionListener {
	
	JButton button;
	String[] labels;
	int currentLabel;
	
	ButtonHandler(JButton button, String[] labels, int currentLabel) {
		this.button = button;
		this.labels = labels;
		this.currentLabel = currentLabel;
	}
	
	public void actionPerformed(ActionEvent e) {
		currentLabel ++;
		if (currentLabel >= labels.length) {
			currentLabel = 0;
		}
		button.setText(labels[currentLabel]);
	}	
}