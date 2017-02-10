/*
 * Serialization.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Serialization.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization {

	private ArrayList<SerializablePerson> people;
	
	public Serialization() {
		people = new ArrayList<SerializablePerson>();
	}
	
	public void addPerson(SerializablePerson p) {
		people.add(p);
	}
	
	public void printAll() {
		if (people.size() == 0) {
			System.out.println("Nobody in the list");
		}
		for (SerializablePerson p : people) {
			System.out.println(p);
		}
	}
	
	public void clear() {
		people.clear();
	}
	
	public void save(File file) throws IOException {
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(people);
		fos.close();
	}
	
	@SuppressWarnings("unchecked")
	public void load(File file) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			people = (ArrayList<SerializablePerson>) ois.readObject();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} finally {
			fis.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		Serialization s = new Serialization();
		s.addPerson(new SerializablePerson("Postman", "Pat", 45));
		s.addPerson(new SerializablePerson("Jess", "the Cat", 6));
		s.addPerson(new SerializablePerson("Fireman", "Sam", 32));
		File f = new File("objects.dat"); 
		System.out.println("Saving people:");
		s.printAll();
		s.save(f);
		System.out.println("Clearing list:");
		s.clear();
		s.printAll();
		System.out.println("Reloading list:");
		s.load(f);
		s.printAll();
	}
}
