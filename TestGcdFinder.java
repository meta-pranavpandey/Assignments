package com.pf3.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuickSorter {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSort() {
		QuickSort sortElement = new QuickSort();
		int[] unsorted = { 6, 1, 9, 15, 10 };
		int[] sorted = { 1, 6, 9, 10, 15 };
		assertArrayEquals(sorted, sortElement.quickSort(unsorted));
	}

}