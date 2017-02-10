/*
 * AdapterExample.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* AdapterExample.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.guis.eventhandling;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class AdapterExample extends JFrame {
	JLabel label;
	
	public AdapterExample() {
		setSize(300, 300);	
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		label = new JLabel("", JLabel.CENTER);
		getContentPane().add(label);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				label.setText("Howdy");
			}
			public void windowIconified(WindowEvent e) {
				label.setText("Ignoring me, huh?");
			}		
			public void windowClosing(WindowEvent e) {
				label.setText("Don't leave me!");
			}
		});
		
		this.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				label.setText("Give me some attention!");
			}
		});
		
		setTitle("Using Adapter classes instead of interfaces");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AdapterExample();
	}
}

