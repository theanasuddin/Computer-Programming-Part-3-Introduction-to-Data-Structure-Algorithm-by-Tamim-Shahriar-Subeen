package IntroductionToDataStructureAndAlgorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] elements = new int[100];
		for (int i = 0; i < elements.length; i++) {
			elements[i] = i + 1;
		}

		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		input.close();
		
		int i = binarySearch(elements, elements.length, n);

		if (i == -1) {
			System.out.println(n + " could not be found");
		} else {
			System.out.println(n + " is found at index " + i);
		}
	}
	
	public static int binarySearch(int A[], int n, int x) {
		int left, right, mid;
		left = 0;
		right = n - 1;
		
		while (left <= right) {
			mid = (left + right) / 2;
			
			if (A[mid] == x) {
				return mid;
			}
			
			if (x < A[mid]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return -1;
	}

}
