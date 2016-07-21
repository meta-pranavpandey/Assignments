package com.oops.assignment1;

import static org.junit.Assert.*;

import org.junit.*;
/**
 * This is a junit test class for testing MatrixOperator class
 * @author Pranav_Pandey
 *
 */
	public class TestMatrixOperator {

		MatrixOperator matrixTest = new MatrixOperator();
		
		private int array2D1[][];
		private int array2D2[][];
		private int array2D3[][];
		
		
		/**
		 * This is a set up method for performing test on transposeMatrix method of the MatrixOperator class 
		 */
		@SuppressWarnings("unused")
		@Before
		public void setUp()
		{
			
			int array2D1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			int array2D2[][] = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
			int array2D3[][] = { { 14, 32, 50 }, { 32, 77, 122 }, { 50, 122, 194 } };
			
		}
		
		/**
		 * This method test the transposeMatrix function to find out he transpose of the matrix
		 */
		@SuppressWarnings("deprecation")		//Used because assertEquals(Object,Object) has been depricated
		@Test
		public void testTranspose() {

			
			assertEquals(array2D2, matrixTest.transposeMatrix(array2D1,3,3)); // check for
																// transpose matrix
		}
		
		/**
		 * This method test the multiply function to find out the multiplication of two matrices
		 */
		@SuppressWarnings("deprecation")
		@Test
		public void testMultiplication()
		{
			
			assertEquals(array2D3,
					matrixTest.multiply(array2D1, array2D2, 3, 3, 3, 3));// check
																			// for
																			// multiplication
																			// of
																			// matrix
		}

	}

