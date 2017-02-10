/*
 * TryAlgorithms.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* TryAlgorithms.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.collections.algorithms;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import uk.ac.sheffield.com1003.collections.comparators.SurnameComparator;
import uk.ac.sheffield.com1003.collections.elements.Lecturer;

public class TryAlgorithms {

	List<Lecturer> lecturers;
	
	TryAlgorithms() {
		lecturers = new ArrayList<Lecturer>();
		
		lecturers.add(new Lecturer("Georg Struth"));
		lecturers.add(new Lecturer("Moty Katzman"));
		lecturers.add(new Lecturer("Guy Brown"));
		lecturers.add(new Lecturer("Joab Winkler"));
		lecturers.add(new Lecturer("Phil McMinn"));
		lecturers.add(new Lecturer("Steve Maddock"));
		lecturers.add(new Lecturer("Mike Stannett"));
		lecturers.add(new Lecturer("Siobhan North"));
		lecturers.add(new Lecturer("Marian Gheorghe"));		
	}
	
	void sort1() {
		Collections.sort(lecturers);
		printLecturers();
	}
	
	void sort2() {
		Collections.sort(lecturers, new SurnameComparator());
		printLecturers();
	}
	
	void search() {
		sort1();
		printLecturers();
		
		String name = "Phil McMinn";
		int index = Collections.binarySearch(lecturers, new Lecturer(name));
		
		System.out.println(name+" is at index "+index);
	}
	
	void shuffle() {
		Collections.sort(lecturers);
		System.out.println("Sorted list:");
		printLecturers();
		
		Collections.shuffle(lecturers);
		System.out.println("Shuffled list:");
		printLecturers();
	}
	
	void min() {
		// list does not need to be sorted
		Collections.shuffle(lecturers);
		
		Lecturer first = Collections.min(lecturers);
		System.out.println(first.getName());
	}
	
	void max() {
		// list does not need to be sorted
		Collections.shuffle(lecturers);
		
		Lecturer last = Collections.max(lecturers, new SurnameComparator());
		System.out.println(last.getName());
	}
	
	void printLecturers() {
		int index = 0;
		for (Lecturer l : lecturers) {
			System.out.println(index + ") "+ l.getName());
			index ++;
		}	
	}
	
	public static void main(String[] args) {
		TryAlgorithms t = new TryAlgorithms();
		
		// uncomment a line to try an algorithm
		t.sort1();
		//t.sort2();
		//t.search();
		//t.shuffle();
		//t.min();
		//t.max();
	}
}
