package com.pf3.assignment;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * This is a junit test class for LargestDigitFinder class
 * 
 * @author Pranav_Pandey
 *
 */
public class TestLargestDigitFinder {

	LargestDigitFinder ldf = new LargestDigitFinder();

	/**
	 * This method tests the findLargestDigit function of the LargestDigitFinder
	 * class as specified by the user
	 */
	@Test
	public void digitFindingTest() {

		assertEquals(2, ldf.findLargestDigit(2));
		assertEquals(9, ldf.findLargestDigit(1257369));
		assertEquals(4, ldf.findLargestDigit(444));

	}

}
