package assignment2;

import org.junit.*;

import static org.junit.Assert.*;

public class TestUniqueCharacters {

	UniqueCharacters testUnique = new UniqueCharacters();
	String inputOne, inputTwo;
	int countOne, countTwo;

	@Before
	public void setUp() {
		inputOne = "i am the best, oh yes!!";
		countOne = 13;
		inputTwo = "";
		countTwo = 0;
	}

	/**
	 * First test case
	 */
	@Test
	public void testOne() {
		assertEquals(countOne, testUnique.checkUnique(inputOne));
	}

	/**
	 * Test case for empty string
	 */
	@Test
	public void testTwo() {
		assertEquals(countTwo, testUnique.checkUnique(inputTwo));
	}

}