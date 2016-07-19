package com.pf3.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestRemainderFinder {

	RemainderFinder rf = new RemainderFinder();

	@Test
	public void remainderTesting() {

		assertEquals(0, rf.findRemainder(2, 1));
		assertEquals(000000,rf.findRemainder(2,0));
		assertEquals(1,rf.findRemainder(100,3));

	}
}
