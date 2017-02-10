/*
 * TryGUIComponents.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TryGUIComponents.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/package uk.ac.sheffield.com1003.guis;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import uk.ac.sheffield.com1003.graphics.CentredFrame;

@SuppressWarnings("serial")
public class TryGUIComponents extends CentredFrame {
	
	Container container;
	
	public TryGUIComponents() {
		container = getContentPane();
		container.setLayout(new FlowLayout());
	}
	
	void checkboxes() {
		setTitle("Checkboxes");
		JCheckBox cb = new JCheckBox("Are you happy?");
		cb.setSelected(true);
		container.add(cb);
	}
	
	void radioButtons() {
		setTitle("Radio Buttons");
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton r1 = new JRadioButton("1");
		group.add(r1);

		JRadioButton r2 = new JRadioButton("2");
		group.add(r2);

		JRadioButton r3 = new JRadioButton("3");
		group.add(r3);

		container.add(r1);
		container.add(r2);
		container.add(r3);
	}	
	
	void comboBox() {
		setTitle("Combo box");
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Bird");
		comboBox.addItem("Elephant");
		comboBox.addItem("Crocodile");
		
		// can set it so that the box may be edited
		comboBox.setEditable(true);
		
		container.add(comboBox);
	}
	
	void menus() {
		setTitle("Menus");
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Help");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("About");
		menu.add(menuItem);
	}
	
	void labels() {
		setTitle("Labels");
		setLayout(new GridLayout(0, 1));
		
		container.add(new JLabel("The first label of the set"));
		container.add(new JLabel("Right-aligned label", JLabel.RIGHT));
		container.add(new JLabel("<html><b>HTML</b> <i>label</i></html>"));
	}	
	
	void textFields() {
		setTitle("Text fields");	
		setLayout(new GridLayout(0, 1));
		
		JTextField tf1 = new JTextField(20);
		
		JTextField tf2 = new JTextField(20);
		tf2.setText("Type here");
		
		JPasswordField pf = new JPasswordField(20);
		pf.setText("No peeking!");
		
		JFormattedTextField ftf = new JFormattedTextField();
		ftf.setValue(new Double(10.3));		
		
		container.add(tf1);
		container.add(tf2);
		container.add(pf);
		container.add(ftf);
	}
	
	public static void main(String[] args) {
		TryGUIComponents guiComponents = new TryGUIComponents();
		
		// change this method call to see different
		// GUI components
		guiComponents.checkboxes();
		
		guiComponents.setVisible(true);
	}
	
}
