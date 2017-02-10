/*
 * CopyingObjects.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* CopyingObjects.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.composition;

public class CopyingObjects {

	// straight variable copy
	public static void variableCopy() {
		Knight k1 = new Knight("Sir Lancelot");
		Knight k2 = new Knight("King Arthur");
		
		k1 = k2;
		k1.setName("Sir Galahad");
		System.out.println(k1.getName());
		System.out.println(k2.getName());
	}

	// notice the difference with variable copy
	public static void objectCopy() {
		Knight k1 = new Knight("Sir Lancelot");
		Knight k2 = new Knight("King Arthur");
		 
		k1 = new Knight(k2.getName());
		k1.setName("Sir Galahad");
		System.out.println(k1.getName());
		System.out.println(k2.getName());
	}

	// notice that shallow copies don't have the desired effect
	// for objects composed of objects
	public static void shallowCopy() {
		Dragon d1 = new Dragon("Drago", false);
		Dragon d2 = new Dragon("Pendragon", true);
		
		Knight k1 = new Knight("Sir Lancelot", d1);
		Knight k2 = new Knight("King Arthur", d2);
		
		k1 = new Knight(k2.getName(), k2.getDragon());
		
		k1.setName("Sir Galahad");
		k1.getDragon().setName("Livyathan");
		
		System.out.println(k1);
		System.out.println(k2);
	}
	
	// notice the difference with deepCopy
	public static void deepCopy() {
		Dragon d1 = new Dragon("Drago", false);
		Dragon d2 = new Dragon("Pendragon", true);
		
		Knight k1 = new Knight("Sir Lancelot", d1);
		Knight k2 = new Knight("King Arthur", d2);
		
		// key difference is the creation of a new Dragon object, 
		// using the same instance field values
		k1 = new Knight(k2.getName(), 
				        new Dragon(k2.getDragon().getName(), 
				        		       k2.getDragon().isBreathesFire()));
		
		k1.setName("Sir Galahad");
		k1.getDragon().setName("Livyathan");
		
		System.out.println(k1);
		System.out.println(k2);
	}
	
	public static void main(String[] args) {
		
		System.out.println("1) variable copy");
		variableCopy();
		
		System.out.println("2) object copy");
		objectCopy();
		
		System.out.println("3) shallow copy");
		shallowCopy();
		
		System.out.println("4) deep copy");
		deepCopy();
	}
}

