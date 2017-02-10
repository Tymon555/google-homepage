package uk.ac.sheffield.com1003.debuggingandtesting;

public class BuggyNumZeros {

	public int numZeros(int[] x) {
		int count = 0;
		for (int i=1; i < x.length; i++) {
			System.out.println("The loop body was entered");
			System.out.println("The value of i is "+i);
			if (x[i] == 0) {
				count ++;
				System.out.println("The count was increased to "+count);
			}
		}
		System.out.println("The final count is "+count);
		return count;
	}
	
	public static void main(String[] args) {
		BuggyNumZeros b = new BuggyNumZeros();
		int[] x = {0, 0};
		b.numZeros(x);
	}
}


