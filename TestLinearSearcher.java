package com.pf3.assignment;

import org.junit.*;

import static org.junit.Assert.*;

public class TestLinearSearcher {
	LinearSearcher tls = new LinearSearcher();

	@Test
	public void testlsr() {
		int[] arrayOne = { 2, 5, 8, 9, 10, 77, 55 };
		assertEquals(-1, tls.searchLinear(arrayOne, 88));
		tls.index = 0;
		int[] arrayTwo = { 2, 5, 8, 9, 10, 77, 55, 11 };
		assertEquals(5, tls.searchLinear(arrayTwo, 77));

	}
}