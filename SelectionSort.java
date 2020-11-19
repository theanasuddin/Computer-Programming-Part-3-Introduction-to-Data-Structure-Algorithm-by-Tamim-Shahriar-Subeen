package IntroductionToDataStructureAndAlgorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = { 8, 2, 4, 1, 5, 7 };

		// before sort
		System.out.println(Arrays.toString(numbers));
		SelectionSort selectionSort = new SelectionSort();
		// after sort
		selectionSort.selectionSortAsc(numbers, numbers.length);
		System.out.println(Arrays.toString(numbers));
		selectionSort.selectionSortDesc(numbers, numbers.length);
		System.out.println(Arrays.toString(numbers));

	}

	public void selectionSortAsc(int array[], int n) {
		int minIndex;
		int temp;

		for (int i = 0; i < n - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}

	public void selectionSortDesc(int array[], int n) {
		int maxIndex;
		int temp;

		for (int i = 0; i < n - 1; i++) {
			maxIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] > array[maxIndex]) {
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				temp = array[i];
				array[i] = array[maxIndex];
				array[maxIndex] = temp;
			}
		}
	}

}
