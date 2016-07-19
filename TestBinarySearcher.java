package com.pf3.assignment;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * This is a JUnit test class for testing BinarySearcher class for
 * 
 * @author Pranav_Pandey
 *
 */
public class TestBinarySearcher {
	BinarySearcher bs = new BinarySearcher();

	/**
	 * This method tests the searchBinary method of the BinarySearcher class
	 * with the given inputs
	 */
	@Test
	public void testlsr() {
		int[] arrayOne = { 2, 5, 8, 9, 10, 55, 77 };
		assertEquals(-1, bs.searchBinary(arrayOne, 88, 0, 6));
		bs.elementPosition = 0;
		int[] arrayTwo = { 2, 5, 8, 9, 10, 55, 77 };
		assertEquals(6, bs.searchBinary(arrayTwo, 77, 0, 6));

	}
}