package com.pf3.assignment;

import org.junit.*;

/**
 * This is a junit test class for LinearSearcher class
 * @author Pranav_Pandey
 *
 */

import static org.junit.Assert.*;

public class TestLinearSearcher {
	LinearSearcher tls = new LinearSearcher();

	/**
	 * This method tests the searchLinear method of the LinearSearcher class
	 * with the given inputs
	 */
	@Test
	public void testlsr() {
		int[] arrayOne = { 2, 5, 8, 9, 10, 77, 55 };
		assertEquals(-1, tls.searchLinear(arrayOne, 88));
		tls.index = 0;
		int[] arrayTwo = { 2, 5, 8, 9, 10, 77, 55, 11 };
		assertEquals(5, tls.searchLinear(arrayTwo, 77));

	}
}