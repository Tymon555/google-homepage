/*
 * TryLayout.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TryLayout.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.guis;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;

import uk.ac.sheffield.com1003.graphics.CentredFrame;

@SuppressWarnings("serial")
public class TryLayout extends CentredFrame {

	void flowLayout() {
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		contentPane.add(new JButton("4"));
		contentPane.add(new JButton("5"));		
	}

	void borderLayout() {
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		contentPane.add(new JButton("1"), BorderLayout.CENTER);
		contentPane.add(new JButton("2"), BorderLayout.NORTH);
		contentPane.add(new JButton("3"), BorderLayout.SOUTH);
		contentPane.add(new JButton("4"), BorderLayout.EAST);
		contentPane.add(new JButton("5"), BorderLayout.WEST);		
	}	
	
	void gridLayout() {
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(0, 3));
		
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		contentPane.add(new JButton("4"));
		contentPane.add(new JButton("5"));			
	}
	
	void nullLayout() {
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		JButton jbutton1 = new JButton("1");
		JButton jbutton2 = new JButton("2");
				
		contentPane.add(jbutton1);
		contentPane.add(jbutton2);
		
		jbutton1.setBounds(10, 10, 30, 15);
		jbutton2.setBounds(40, 40, 30, 15);
	}	
	
	public static void main(String[] args) {
		TryLayout tryLayout = new TryLayout();
		
		// change this to a different method to see the 
		// effect of different types of layout
		tryLayout.nullLayout();
		
		tryLayout.setVisible(true);
	}
	
}
