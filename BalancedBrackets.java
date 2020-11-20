package IntroductionToDataStructureAndAlgorithm;

import java.util.Scanner;

public class BalancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		char[] inputArray = inputString.toCharArray();
		if (isBalanced(inputArray)) {
			System.out.println(inputString + " is balanced");
		} else {
			System.out.println(inputString + " is not balanced");

		}

	}

	public static boolean isBalanced(char input[]) {
		int len = input.length;
		char lastChar;
		int top = 0;
		char[] stack = new char[len];

		for (int i = 0; i < len; i++) {
			char x = input[i];
			if (x == '(' || x == '[' || x == '{') {
				stack[top] = x;
				top++;
			} else if (x == ')' || x == ']' || x == '}') {
				if (top == 0) {
					return false;
				}
				top--;
				lastChar = stack[top];
				switch (x) {
				case ')':
					if (lastChar != '(') {
						return false;
					}
					break;

				case ']':
					if (lastChar != '[') {
						return false;
					}
					break;
				case '}':
					if (lastChar != '{') {
						return false;
					}
					break;
				}
			}
		}
		if (top == 0) {
			return true;
		} else {
			return false;
		}
	}

}
