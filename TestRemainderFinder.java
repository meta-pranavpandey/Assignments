package com.pf3.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This is a junit test class for RemainderFinder class
 * 
 * @author Pranav_Pandey
 *
 */
public class TestRemainderFinder {

	RemainderFinder rf = new RemainderFinder();

	/**
	 * This method tests the findRemainder method of RemainderFinder class by
	 * giving inputs specified in the assignment.
	 */
	@Test
	public void remainderTesting() {

		assertEquals(0, rf.findRemainder(2, 1));
		assertEquals(000000, rf.findRemainder(2, 0));
		assertEquals(1, rf.findRemainder(100, 3));

	}
}
