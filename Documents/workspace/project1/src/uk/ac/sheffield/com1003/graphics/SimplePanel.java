/*
 * SimplePanel.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* SimplePanel.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")

public class SimplePanel extends JPanel {

	public SimplePanel(){
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// draw a simple line from (20,20) to (120,70)
		g.drawLine(20, 20,  120, 70);
		
		// add a rectangle, with 10 pixel line thickness, coloured red at (20,20)
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(10));
		g2.setPaint(new Color(128, 0, 128));
		Rectangle2D.Double s = new Rectangle2D.Double(20.0, 100.0, 100.0, 50.0);
		g2.draw(s);
		
		// add some text in an unusual font
		g2.setPaint(Color.black);
		g2.setFont(new Font("Papyrus", Font.PLAIN, 48));
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		String text = "Some example text";
		g2.drawString(text,  200,  100);
		
		// add an image loaded from a file
	    try {                
	    	BufferedImage image = ImageIO.read(new File("Alligator.jpg"));
	    	g2.drawImage(image, 10,  175,  300,  200, null); 
	    } 
	    catch (IOException e) {
				e.printStackTrace();
		}

	}
}
