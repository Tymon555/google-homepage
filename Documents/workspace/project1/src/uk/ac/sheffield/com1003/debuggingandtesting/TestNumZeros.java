package uk.ac.sheffield.com1003.debuggingandtesting;

import org.junit.*;
import static org.junit.Assert.*;

public class TestNumZeros {

	BuggyNumZeros numZeros;
	
	@Before
	public void setup() {
		numZeros = new BuggyNumZeros();
	}
	
	@Test
	public void testSingleZero() {
		int[] x = {0};
		int result = numZeros.numZeros(x);
		assertEquals(1, result);
	}
	
	@Test
	public void testTwoZeros() {
		int[] x = {0, 0};
		int result = numZeros.numZeros(x);
		assertEquals(2, result);
	}
	
	@Test
	public void testSingleOne() {
		int[] x = {1};
		int result = numZeros.numZeros(x);
		assertEquals(0, result);
	}
	
	@Test
	public void testTwoOnes() {
		int[] x = {1, 1};
		int result = numZeros.numZeros(x);
		assertEquals(0, result);
	}	

	@Test
	public void testMixture1() {
		int[] x = {0, 1, 1};
		int result = numZeros.numZeros(x);
		assertEquals(1, result);
	}
	
	@Test
	public void testMixture2() {
		int[] x = {1, 0, 1};
		int result = numZeros.numZeros(x);
		assertEquals(1, result);
	}	
	
	@After
	public void tearDown() {
		
	}
}
