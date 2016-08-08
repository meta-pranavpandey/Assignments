public class BinarySearcher {

	public static final int ARRAY_NOT_SORTED = -1;

	/**
	 * Following function returns the result of searching of item in the binary
	 * search tree.
	 * 
	 * @param arr
	 *            (int []) denotes the array.
	 * @param low
	 *            (int) denotes the lowest index of array.
	 * @param high
	 *            (int) denotes the highest index of array.
	 * @param element
	 *            (int) denotes the item to search.
	 * @return (int) the position of item.
	 */
	public int binarySearch(int arr[], int low, int high, int element) {

		if (checkSorting(arr)) {

			if (arr.length == 0) {
				System.out.println("Empty Array");
				return -1;
			} else {
				/* To store middle position */
				int mid = (low + high) / 2;
				/* End condition */
				if (low > high) {

					return -1;
				} else if (element < arr[mid]) {/*
												 * If the searched element is
												 * less than the middle element
												 */
					return binarySearch(arr, low, mid - 1, element);
				} else if (element > arr[mid]) {/*
												 * If the searched element is
												 * greater than the middle
												 * element
												 */
					return binarySearch(arr, mid + 1, high, element);
				} else {
					int leftOccurance = 0;
					leftOccurance = binarySearch(arr, low, mid - 1,
							element);
					if (leftOccurance == -1) {
						return mid;
					} else {
						return leftOccurance;
					}
				}
			}
		} else {
			return ARRAY_NOT_SORTED;
		}

	}

	/**
	 * Checks if the given array is sorted or not
	 * 
	 * @param arr
	 * @return TRUE if the array is sorted and FALSE if not
	 */
	public boolean checkSorting(int arr[]) {
		int sortCount = 1;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				sortCount++;
			}
		}
		if (sortCount == arr.length)
			return true;
		else
			return false;
	}
}