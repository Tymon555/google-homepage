/*
 * Buffering.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Buffering.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.io;

import java.io.*;

public class Buffering {

	public static void test(int numWrites) throws IOException {
		
		PrintStream ps = new PrintStream("printstream.txt");
		PrintWriter pw = new PrintWriter("printwriter.txt");

		long startTime = System.currentTimeMillis();
		
		for (int i=1; i < numWrites; i++) {
			ps.println("Line no. "+i);
		}
		long psTime = System.currentTimeMillis() - startTime;
		
		startTime = System.currentTimeMillis();
		for (int i=1; i < numWrites; i++) {
			pw.println("Line no. "+i);
		}
		pw.flush();
		long pwTime = System.currentTimeMillis() - startTime;						
		
		System.out.println("Number of lines to write: "+numWrites);
		System.out.println("PrintStream time: " + psTime + " milliseconds");
		System.out.println("PrintWriter time: " + pwTime + " milliseconds");
		System.out.println("Difference: " + Math.abs(psTime-pwTime) + " milliseconds");
		
		ps.close();
		pw.close();
	}
	
	public static void main(String[] args) throws IOException {
		for (int i=0; i <= 7; i++) {
			int numWrites = (int) Math.pow(10, i);
			test(numWrites);
		}
		System.out.println("done");
	}
}