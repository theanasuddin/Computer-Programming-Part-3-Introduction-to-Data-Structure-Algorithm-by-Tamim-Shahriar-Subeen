package IntroductionToDataStructureAndAlgorithm;

import java.util.Scanner;

public class EvenOddPage21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		input.close();
		if (n % 2 == 0) {
			System.out.println(n + " is even number.");
		}
		else {
			System.out.println(n + " is odd number.");
		}

	}

}
