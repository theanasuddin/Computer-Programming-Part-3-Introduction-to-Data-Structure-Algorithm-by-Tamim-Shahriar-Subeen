package IntroductionToDataStructureAndAlgorithm;

import java.util.Arrays;

public class InsertionSort {
	int array1[] = { 5, 4, 3, 2, 1 };
	int array2[] = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort insertionSort = new InsertionSort();
		System.out.print("Before sort: ");
		System.out.println(Arrays.toString(insertionSort.array1));
		insertionSort.insertionSort(insertionSort.array1, insertionSort.array1.length);
		System.out.print("After sort: ");
		System.out.println(Arrays.toString(insertionSort.array1));
		System.out.println();
		System.out.print("Before sort: ");
		System.out.println(Arrays.toString(insertionSort.array2));
		insertionSort.insertionSort(insertionSort.array2, insertionSort.array2.length);
		System.out.print("After sort: ");
		System.out.println(Arrays.toString(insertionSort.array2));

	}

	public void insertionSort(int A[], int n) {
		int i, j, item;

		for (i = 1; i < n; i++) {
			item = A[i];
			j = i - 1;
			while (j >= 0 && A[j] > item) {
				A[j + 1] = A[j];
				j = j - 1;

			}
			A[j + 1] = item;

		}
	}

}
