package com.pf2.assignment;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestDiamondPatternMaker {
	
	DiamondPatternMaker object=new DiamondPatternMaker();
	
	/**This function checks if the spacecount function in DiamondPatternMkaer class if it returns 
	 * the correct number of spaces or not
	 * 
	 */
	
	@Test
	public void test1() {

		assertEquals("    ",object.spaceCount(1, 5));
		assertEquals("   ",object.spaceCount(2, 5));
		assertEquals("  ",object.spaceCount(3, 5));
		assertEquals(" ",object.spaceCount(4, 5));
		assertEquals("",object.spaceCount(5, 5));
	}
	
	/**This function tests the numberSequence function in DiamondPatternMkaer class returns the correct
	 * numbers or not
	 * 
	 */
	@Test
	public void test2() {

		assertEquals("1",object.numberSequence(1, 5));
		assertEquals("121",object.numberSequence(2, 5));
		assertEquals("12321",object.numberSequence(3, 5));
		assertEquals("1234321",object.numberSequence(4, 5));
		assertEquals("123454321",object.numberSequence(5, 5));
	}
	
	/**This function test the whole pattern to be printed if its correct or not
	 * 
	 */
	@Test
	public void test3() {
		String expected[]={"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};

		assertArrayEquals(expected,object.patternArrangement(5));
	}

}



