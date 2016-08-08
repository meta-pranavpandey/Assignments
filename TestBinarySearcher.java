import static org.junit.Assert.*;

import org.junit.*;

/**
 * Test class for Binary Search to check its working
 * 
 * @author Pranav_Pandey
 *
 */
public class TestBinarySearcher {
	private int expected;
	private int arrayOne[];
	private int arrayTwo[];
	BinarySearcher obj = new BinarySearcher();

	/**
	 * Setting up of variables for testing
	 */
	@Before
	public void setUp() {
		arrayOne = new int[] { 1, 1, 2, 2, 3, 3 };
		arrayTwo = new int[] { 5, 1, 9, 2, 47, 2 };
		expected = 2;
	}

	@Test
	public void leftOccuranceTest() {
		assertEquals(expected,
				obj.binarySearch(arrayOne, 0, arrayOne.length - 1, 2));
	}

	@Test
	public void unsortedArrayTest() {
		assertEquals(-1, obj.binarySearch(arrayTwo, 0, arrayOne.length - 1, 2));
	}
}