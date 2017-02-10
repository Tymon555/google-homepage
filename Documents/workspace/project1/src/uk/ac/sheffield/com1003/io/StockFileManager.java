/*
 * StockFileManager.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* StockFileManager.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.io;

import java.util.*;
import java.io.*; 

public class StockFileManager {
	
	private String fileName;
	
	public StockFileManager(String fileName) {
		this.fileName = fileName;
	}
	
	public void writeData(ArrayList<StockItem> stockItems) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		DataOutputStream dos = new DataOutputStream(fos);
		
		for (StockItem stockItem: stockItems) {
			dos.writeChars(stockItem.getItemCode());
			dos.writeInt(stockItem.getNumberInStock());
			dos.writeDouble(stockItem.getPrice());
		}
		
		dos.close();
	}
	
	public ArrayList<StockItem> readData() throws IOException, BadItemCodeException {
		ArrayList<StockItem> stockItems = new ArrayList<StockItem>();
		
		FileInputStream fis = new FileInputStream(fileName);
		DataInputStream dis = new DataInputStream(fis);
		
		try {
			while (true) {
				String itemCode = "";
				for (int i=0; i < StockItem.ITEM_CODE_LENGTH; i++) {
					itemCode += dis.readChar();
				}
				int numberInStock = dis.readInt();
				double price = dis.readDouble();
				stockItems.add(new StockItem(itemCode, numberInStock, price));
			}
		} catch (EOFException e) {
			// An entirely expected exception - the end of the file has been reached.
			// One of the (few) cases where no handler code needs to be written.
		}
		
		dis.close();
		
		return stockItems;
	}
	
	public static void main(String[] args) throws IOException, BadItemCodeException {
		ArrayList<StockItem> stockItems = new ArrayList<StockItem>();
		stockItems.add(new StockItem("BREAD ", 5,  0.53));
		stockItems.add(new StockItem("CHEESE", 25, 1.52));
		stockItems.add(new StockItem("HAM   ", 2,  2.01));		
		
		StockFileManager sfm = new StockFileManager("stockdata");
		sfm.writeData(stockItems);
		ArrayList<StockItem> readBackStockItems = sfm.readData();

		System.out.println("The contents of the file are: ");
		for (StockItem stockItem: readBackStockItems) {
			System.out.println(stockItem.getItemCode() + "  " +
			                   stockItem.getNumberInStock() + "  " +
			                   stockItem.getPrice());
		}
	}
}

class StockItem {
	static final int ITEM_CODE_LENGTH = 6;
	
	private String itemCode;
	private int numberInStock;
	private double price;
	
	StockItem(String itemCode, int numberInStock, double price) 
			throws BadItemCodeException {
		if (itemCode.length() != ITEM_CODE_LENGTH) {
			throw new BadItemCodeException(itemCode);
		}
		
		this.itemCode = itemCode;
		this.numberInStock = numberInStock;
		this.price = price;
	}
	
	String getItemCode() {
		return itemCode;
	}
	
	int getNumberInStock() {
		return numberInStock;
	}
	
	double getPrice() {
		return price;
	}
}

@SuppressWarnings("serial")
class BadItemCodeException extends Exception {
	
	public BadItemCodeException(String itemCode) {
		super("Item code " + itemCode + " is not " +
			  StockItem.ITEM_CODE_LENGTH+" characters long");
	}
}
