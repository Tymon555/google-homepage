/*
 * Lecturer.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* Lecturer.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections.elements;

public class Lecturer implements Comparable<Lecturer>{

	private String name;
	
	public Lecturer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFirstName() {
		return name.substring(0, name.indexOf(" "));
	}

	public String getSurname() {
		return name.substring(name.indexOf(" ")+1);
	}	
	
	public int compareTo(Lecturer other) {
		return this.getName().compareTo(other.getName());
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Lecturer other = (Lecturer) obj;
		if (name == null) {
			if (other.name != null) return false;
		} else if (!name.equals(other.name)) return false;
		return true;
	}	
}
