/*
 * MessageRunnable.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* MessageRunnable.java
* 
*   This program runs prints two messages to the console, and
*   provides a test-bed to explore allocating a thread to 
*   print each message separately.
*
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.threads;

public class MessageRunnable implements Runnable
{
	private String message;
	private static final int DELAY = 500; // ms
	
    // each MessageRunnable is associated with a message to display
	public MessageRunnable(String m)
	{
		message = m;
	}
	
    // run method required by Runnable interface
    // displays the message 10 times in a loop,
    // with a delay
	public void run()
	{
		try
		{
			for (int i = 1; i <= 10; i++)
			{
					System.out.println( message );
					Thread.sleep(DELAY);
			}
		}	
		catch(InterruptedException ie)
		{
			System.out.println("Thread interrupted!");
		}
	}
	
	public static void main(String[] args)
	{
        // create two MessageRunnable objects, each with a 
        // different message
		MessageRunnable m1 = new MessageRunnable("Hello");
		MessageRunnable m2 = new MessageRunnable("Goodbye");
		
        // invoke run method on each object sequentially
		//m1.run();
		//m2.run();
		
        // alternative code to allocate a thread to each object
        Thread t1 = new Thread(m1);
		t1.start();
		
		Thread t2 = new Thread(m2);
		t2.start();

	}

}
