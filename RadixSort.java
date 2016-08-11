/**
 *This class is for sorting using radix sort
 * @author Pranav_Pandey
 */
public class RadixSort {
	/**
	 * Sorts the given array using Radix Sort technique
	 * 
	 * @param array
	 * @param digitCount
	 *            -> digit in maximum element in array
	 * @return resulted array
	 */
	public int[] radixSort(int array[], int digitCount) {

		int tempArray[] = array;
		Queue queue[] = new Queue[10];
		for (int index = 0; index < 10; index++) {
			queue[index] = new Queue();
		}

		for (int rowIndex = 0; rowIndex < digitCount; rowIndex++) {
			for (int index = 0; index < array.length; index++) {

				queue[(tempArray[index] / power(10, rowIndex)) % 10]
						.enqueue(tempArray[index]); // logic to compute position
													// via modulus operation
													// using array Element &
													// enqueue it
			}
			int count = 0;
			for (int index = 0; index < 10; index++) {
				while (queue[index].size() != 0) {
					tempArray[count++] = queue[index].dequeue(); // dequeue and
																	// store it
																	// into
																	// tempArray
				}
			}

		}

		return tempArray;

	}

	// method to compute power
	public int power(int number1, int number2) {
		int power = 1;
		for (int c = 0; c < number2; c++)
			power *= number1;
		return power;
	}
}
