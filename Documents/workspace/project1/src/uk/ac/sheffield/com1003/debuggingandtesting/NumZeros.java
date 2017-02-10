package uk.ac.sheffield.com1003.debuggingandtesting;

public class NumZeros {

	public int numZeros(int[] x) {
		int count = 0;
		for (int i=0; i < x.length; i++) {
			if (x[i] == 0) {
				count ++;
			}
		}
		return count;
	}		
}



