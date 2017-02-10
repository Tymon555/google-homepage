/*
 * CarSales.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* CarSales.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Richard Clayton  (r.h.clayton@sheffield.ac.uk)
*/

package uk.ac.sheffield.com1003.classesobjects;
// The program read a car stock file called stock.txt.
// The first line contains an integer representing the 
// total number of cars in stock.  This is followed by a
// line of data for each car where each line has the format
//  <model> <colour> <price> <sold=True/False>
// The program uses a for-loop to read this data, build car
// objects and store the car objects  in an array. 
// When all entries have been read a second for-loop is
// used to display all the cars in the array.

import java.util.Scanner;
import java.io.File;

public class CarSales {
    public static void main (String[] args) throws Exception {
	
    	// Set up scanner object to read stock.txt file
    	// which should be located in the ECLIPSE root folder
    	Scanner file = new Scanner(new File("stock.txt"));
	
    	// First number in file represents number of cars
    	int nCars = file.nextInt();

    	// Set up an array to store all the car objects
    	Car[] cars = new Car[nCars];

    	// Read each line of the file
    	for (int i=0; i<nCars; i++) {

    		// Read each field ...
    		String model = file.next();
    		String colour = file.next();
    		int price = file.nextInt();
    		boolean sold = file.nextBoolean();
	    
    		// ...use data to build car object; store in array.
    		cars[i] = new Car(model, colour, price, sold);	    
    	}

    	// Finally, print each of the cars in the array
    	for (int i=0; i<nCars; i++) {
    		System.out.println(cars[i]);
    	}
    	
    	// close the file
    	file.close();

    }
}

