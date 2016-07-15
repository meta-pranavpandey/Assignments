package com.pf2.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestInvertedPatternMaker
{
	
	InvertedPatternMaker ipm=new InvertedPatternMaker();
	
	/**This is test function for InvertedPatternMaker class and it tests the space 
	 * function of the class if it return the correct number of spaces for each row or not
	 * 
	 */
	@Test
	public void spaceTesting()
	{
		
		
		assertEquals("",ipm.space(1,5));				//Space check for 1st row
		assertEquals(" ",ipm.space(2,5));				//Space check for 2nd row
		assertEquals("  ",ipm.space(3,5));				//Space check for 3rd row
		assertEquals("   ",ipm.space(4,5));				//Space check for 4th row
		assertEquals("    ",ipm.space(5,5));			//Space check for 5th row
		
	}
	
	/**This is test function for InvertedPatternMaker class and it tests the number 
	 * function of the class whether it return correct numbers for each row or not
	 * 
	 */
	@Test
	public void numberTesting()
	{
		
		assertEquals("12345",ipm.number(1,5));			//Number check for 1st row
		assertEquals("1234",ipm.number(2,5));			//Number check for 2nd row
		assertEquals("123",ipm.number(3,5));			//Number check for 3rd row
		assertEquals("12",ipm.number(4,5));				//Number check for 4th row
		assertEquals("1",ipm.number(5,5));				//Number check for 5th row
		
	}
	
	@Test
	public void printWholePyramidTesting()
	{
		String expected[]={"12345"," 1234","  123","   12","    1"};

		assertArrayEquals(expected,ipm.printWholePyramid(5));
	}
}
