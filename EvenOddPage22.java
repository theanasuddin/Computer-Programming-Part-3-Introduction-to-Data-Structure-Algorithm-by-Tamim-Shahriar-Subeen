package IntroductionToDataStructureAndAlgorithm;

import java.util.Scanner;

public class EvenOddPage22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		input.close();

		boolean[] even = new boolean[n + 1];
		for (int i = 0; i < even.length; i++) {
			even[i] = false;
		}
		for (int i = 0; i < even.length; i += 2) {
			even[i] = true;
		}

		if (even[n]) {
			System.out.println(n + " is even number.");
		} else {
			System.out.println(n + " is odd number.");
		}

	}

}
