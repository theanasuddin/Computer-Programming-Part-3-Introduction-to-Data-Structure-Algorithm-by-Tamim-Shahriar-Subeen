package IntroductionToDataStructureAndAlgorithm;

import java.util.Scanner;

public class NestedLoopPage23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int count = 0;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		input.close();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				count++;
			}
		}
		System.out.println("n = " + n + ",count = " + count);
		// time complexity O(n^2)

	}

}
