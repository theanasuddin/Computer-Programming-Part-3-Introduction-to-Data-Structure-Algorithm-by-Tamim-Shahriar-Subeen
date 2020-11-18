package IntroductionToDataStructureAndAlgorithm;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[10];
		for (int i = 0; i < elements.length; i++) {
			elements[i] = i + 1;
		}

		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		input.close();

		int i = linearSearch(elements, elements.length, n);

		if (i == -1) {
			System.out.println(n + " could not be found");
		} else {
			System.out.println(n + " is found at index " + i);
		}

	}

	public static int linearSearch(int A[], int n, int x) {
		for (int i = 0; i < n; i++) {
			if (A[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
