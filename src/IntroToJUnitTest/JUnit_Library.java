package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnit_Library {

	@Test
	public void test() {
		assertEquals(15, add(5, 10));
	}
	int add(int x, int y) {
		return x+y;
	}
}
