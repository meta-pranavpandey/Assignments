package com.pf3.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This is a junit test class for GcdFinder class for finding gcd of two numbers
 * 
 * @author Pranav_Pandey
 */

public class TestGcdFinder {

	GcdFinder gcd = new GcdFinder();

	public void setUp() {
	}

	/**
	 * This method tests the findingGcd method of the GcdFinder class with the
	 * given inputs
	 */
	@Test
	public void testSort() {

		assertEquals(1, gcd.findingGcd(2, 1));
		assertEquals(6, gcd.findingGcd(12, 18));
		assertEquals(3, gcd.findingGcd(100, 3));

	}

}