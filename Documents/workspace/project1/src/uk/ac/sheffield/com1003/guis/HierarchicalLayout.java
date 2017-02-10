/*
 * HierarchicalLayout.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* HierarchicalLayout.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.guis;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class HierarchicalLayout extends JFrame {

	public HierarchicalLayout(ImageIcon image){
		setTitle("Guess the animal");
		setSize(800, 600);
		
		JLabel picture = new JLabel(image);
		picture.setPreferredSize(new Dimension(800, 600));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0, 1));
		buttonPanel.add(new JButton("Bird"));
		buttonPanel.add(new JButton("Cat"));
		buttonPanel.add(new JButton("Dog"));
		buttonPanel.add(new JButton("Alligator"));
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(buttonPanel, BorderLayout.WEST);
		contentPane.add(picture, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args) throws MalformedURLException {
		new HierarchicalLayout(new ImageIcon(new URL("http://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Alligator_mississippiensis_-_Oasis_Park_-_13.jpg/800px-Alligator_mississippiensis_-_Oasis_Park_-_13.jpg")));
	}
}
