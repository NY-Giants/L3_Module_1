package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class MoreAndMoreTests {

	@Test
  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
  }

	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }

	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }

	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }

	private boolean isCube(int d) {
		for(int f = 1; f <= d; f++) {
			if(d == f*f*f) {
				
				return true;
			}
			else {
				
			}
			
		}
		return false;
		
		
	}

	private boolean isSquare(int p) {
		for(int q = 1; q <= p; q++) {
			if(q*q == p) {
				return true;
			}
			else {
				
			}
			
		}
		
		return false;
	}

	private boolean isPrime(int s) {
		for(int i = 2; i < s; i++) {
			int k = s%i;
			
			if(k == 0) {
				return false;
			}
			else {
				
			}
			
		}
		
		return true;
		
	}

	private String multiply(int i, int j) {
		int k = i*j;
		 String m = i + " x "+ j + " = " + k;
		 
		return m;
	}



}
