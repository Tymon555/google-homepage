/*
 * WindowAndFocusEventDemo.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* WindowAndFocusEventDemo.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.guis.eventhandling;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class WindowAndFocusEventDemo extends JFrame {
	JLabel label;
	
	public WindowAndFocusEventDemo() {
		setSize(300, 300);	
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		label = new JLabel("", JLabel.CENTER);
		getContentPane().add(label);
		
		this.addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent e) {
				label.setText("Howdy");
			}
			public void windowIconified(WindowEvent e) {
				label.setText("Ignoring me, huh?");
			}		
			public void windowDeiconified(WindowEvent e) {}
			public void windowDeactivated(WindowEvent e) {}
			public void windowClosing(WindowEvent e) {
				label.setText("Don't leave me!");
			}
			public void windowClosed(WindowEvent e) {}
			public void windowActivated(WindowEvent e) {}
		});
		
		this.addFocusListener(new FocusListener() {		
			public void focusLost(FocusEvent e) {
				label.setText("Give me some attention!");
			}
			public void focusGained(FocusEvent e) {}
		});
		
		setTitle("Window and Focus Event Demo");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowAndFocusEventDemo();
	}
}
