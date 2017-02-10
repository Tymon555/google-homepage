/*
 * SerializablePerson.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* SerializablePerson.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.io;

import java.io.Serializable;

public class SerializablePerson implements Serializable {
																							
	private static final long serialVersionUID = 3479585752421795051L;
	
	private String firstname, surname;
	private int age;
	
	public SerializablePerson(
			String firstname, 
			String surname, 
			int age) {
		this.firstname = firstname;
		this.surname = surname;
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return firstname + " " + surname + " " + age;
	}
}
