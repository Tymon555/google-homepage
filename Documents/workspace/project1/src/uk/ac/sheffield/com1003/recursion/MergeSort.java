/*
 * MergeSort.java  	1.1 01/05/2016
 *
 * Copyright (c) University of Sheffield 2016
 * 
 * This class implements a recursive method for sorting an array of random integers
 */

/** 
* MergeSort.java
* 
* @version 1.1 21/12/2015
* 
* @author Richard Clayton
*/

package uk.ac.sheffield.com1003.recursion;
import java.util.ArrayList;

public class MergeSort {
	
	private static ArrayList<Comparable> theList = new ArrayList<Comparable>();
	
	public static void doMerge(ArrayList<Comparable> list){
		
		if (list.size() <= 1)
			return;
		
		else{
			ArrayList<Comparable> left = new ArrayList<Comparable>();
			ArrayList<Comparable> right = new ArrayList<Comparable>();
			int divider = list.size()/2;
			
			// divide list into two parts and populate left part
			for (int i = 0; i < divider; i++){
				left.add(list.remove(0));
			}
			// and right part
			while (list.size() > 0){
				right.add(list.remove(0));
			}
			
			// display intermediate stages
			System.out.println("\nleft");
			for (Comparable i : left)
				System.out.print(i + " ");	
			System.out.println("\nright");
			for (Comparable i : right)
				System.out.print(i + " ");	

			// recursive call
			doMerge(left);
			doMerge(right);
			
			// base case
			while ((left.size() != 0) && (right.size() != 0)){
				if (left.get(0).compareTo(right.get(0)) < 0)
					list.add(left.remove(0));
				else
					list.add(right.remove(0));
			}
			while(left.size()!=0)
				list.add(left.remove(0));
			while(right.size()!=0)
				list.add(right.remove(0));
		}
	}
	
	
	public static void main(String[] args){
		
		int N = 11;
		int n = 0;

		
		// set up list of random integers
		for (int i = 1; i <= N; i++)
		{
			n = (int) Math.floor(Math.random() * 100.0);
			theList.add(n);
		}	
		
		// display initial list
		System.out.println("initial");
		for (Comparable i : theList)
			System.out.print(i + " ");
		
		doMerge(theList);
		
		// display sorted list
		System.out.println("\nsorted");
		for (Comparable i : theList)
			System.out.print(i + " ");		
		
	}

}
