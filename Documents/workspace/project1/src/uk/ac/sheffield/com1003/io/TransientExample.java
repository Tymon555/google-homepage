/*
 * TransientExample.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TransientExample.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.io;

import java.io.*;

public class TransientExample implements Serializable {
	
	private static final long serialVersionUID = 3858235919133673751L;
	
	private int x;
	private transient double temp;

	public TransientExample(int x) {
		this.x = x;
		this.temp = x * x/2.0 * x/3.0;
	}

	public String toString() {
		return "The values of x and temp are " + x + " and " + temp + " respectively.";
	}

	public static void main(String[] args) {
		TransientExample trans = new TransientExample(5);

		// Note that 5 and 5 are printed for values of x and y for trans:
		System.out.println("Pre-serialization: " + trans.toString());

		// serialize trans
		File file = new File("out.oos");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(trans);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// set trans to null so that we can be sure to have deleted it
		trans = null;

		// unserialize trans in order to 'get it back'
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			trans = (TransientExample) ois.readObject();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// the reloaded object - note that we don't get a value for y anymore
		// ... it was declared transient
		System.out.println("Post-unserialization: " + trans.toString());
	}
}