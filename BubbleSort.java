package IntroductionToDataStructureAndAlgorithm;

import java.util.Arrays;

public class BubbleSort {
	int numbers[] = { 3, 1, 7, 6, 2 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		// before sort
		System.out.print("Before sort: ");
		BubbleSort bubbleSort = new BubbleSort();
		System.out.println(Arrays.toString(bubbleSort.numbers));
		// after sort
		System.out.println("Steps: ");
		bubbleSort.bubbleSortAsc(bubbleSort.numbers, bubbleSort.numbers.length);
		System.out.print("After sort(Asc): ");
		System.out.println(Arrays.toString(bubbleSort.numbers));
		System.out.println("================================");
		BubbleSort bubbleSortTwo = new BubbleSort();
		System.out.print("Before sort: ");
		System.out.println(Arrays.toString(bubbleSortTwo.numbers));
		System.out.println("Steps: ");
		bubbleSort.bubbleSortDesc(bubbleSortTwo.numbers, bubbleSortTwo.numbers.length);
		System.out.print("After sort(Desc): ");
		System.out.println(Arrays.toString(bubbleSortTwo.numbers));

	}

	public void bubbleSortAsc(int array[], int n) {
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				System.out.println(Arrays.toString(array));
			}
		}

	}

	public void bubbleSortDesc(int array[], int n) {
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				System.out.println(Arrays.toString(array));
			}
		}

	}

}
