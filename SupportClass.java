/**
 * This class is used for providing the additional support functionalities -->
 * for finding Maximum Number --> for finding digit count
 * 
 * @author Pranav_Pandey
 *
 */

public class SupportClass {
	/**
	 * To find the largest element in the array
	 * 
	 * @param array
	 * @return largest element
	 */
	public int maximumNumber(int array[]) {
		int temp = array[0];

		for (int index = 0; index < array.length; index++) {
			if (temp < array[index]) {
				temp = array[index];
			}
		}
		return temp;
	}

	/**
	 * To count the total number of digits in the parameter passed to the
	 * function
	 * 
	 * @param max
	 * @return
	 */
	public int getDigitCount(int max) {
		int count = 1;
		while (max / 10 != 0) {
			count++;
			max = max / 10;
		}
		return count;
	}
}
