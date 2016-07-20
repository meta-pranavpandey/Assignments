package com.pf4.assignment;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * This is a JUnit test class
 * 
 * @author Pranav_Pandey
 *
 */

public class TestNQueensProblem {

	int position[]; // store position of queen for each row
	int output[][][]; // output store all the case that may be possible
	NQueensProblem nQueen = new NQueensProblem();;

	/**
	 * This method is written to provide a setup for testing the queen method of
	 * the NQueensProblem class
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		// fix the size of array
		position = new int[5];
		output = new int[5][5][5];
	}
	/**
	 * This function test the required method with the inputs specified
	 */
	@Test
	public void testQueen() {
		output = nQueen.queen(1, 4, position, output);

		int[] test1 = output[0][1];
		int[] test2 = output[0][2];
		int[] test3 = output[0][3];
		int[] test4 = output[0][4];

		// compare of the possible solution
		assertArrayEquals(new int[] { 0, 0, 1, 0, 0 }, test1);
		assertArrayEquals(new int[] { 0, 0, 0, 0, 1 }, test2);
		assertArrayEquals(new int[] { 0, 1, 0, 0, 0 }, test3);
		assertArrayEquals(new int[] { 0, 0, 0, 1, 0 }, test4);
	}

}