/**
 * THis class is to sort input using bubble sort echnique
 */
public class BubbleSort {

	public int[] bubbleSort(int array[]) {
		int size = array.length;
		for (int index1 = 0; index1 < size; index1++) {
			for (int index2 = 0; index2 < size - index1 - 1; index2++) {
				if (array[index2] > array[index2 + 1]) {
					/*Swap the elements*/
					swap(array, index2, index2 + 1);0
				}
			}
		}

		return array;
	}

	/**
	 * To swap the values of the parameteres passed
	 * 
	 * @param array
	 * @param index
	 * @param nextIndex
	 */
	public void swap(int array[], int index, int nextIndex) {
		int temp = array[index];
		array[index] = array[nextIndex];
		array[nextIndex] = temp;
	}
}
