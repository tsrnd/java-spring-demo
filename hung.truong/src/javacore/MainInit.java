package javacore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainInit {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	boolean isIncreasingDigitsSequence(int n) {
		List<Integer> ints = new ArrayList<>();
		int temp = n;
		while (temp > 0) {
			ints.add(temp % 10);
			temp = temp / 10;
		}
		Collections.reverse(ints);
		if (ints.size() > 1) {
			for (int i = 0; i < ints.size(); i++) {
				if (i < ints.size() - 1 && (ints.get(i + 1) - ints.get(i)) <= 0) {
					return false;
				}
			}
		}
		return true;
	}

	boolean sameDigitNumber(int n) {
		List<Integer> ints = new ArrayList<>();
		int temp = n;
		while (temp > 0) {
			ints.add(temp % 10);
			temp = temp / 10;
		}
		if (ints.size() > 1) {
			for (int i = 0; i < ints.size(); i++) {
				if (i < ints.size() - 1 && ints.get(i + 1) != ints.get(i)) {
					return false;
				}
			}
		}
		return true;
	}

	int commonCharacterCount(String s1, String s2) {
		List<Character> char1 = new ArrayList<>();
		for (int i = 0; i < s1.length(); i++) {
			char1.add(s1.charAt(i));
		}
		List<Character> char2 = new ArrayList<>();
		for (int i = 0; i < s2.length(); i++) {
			char2.add(s2.charAt(i));
		}
		System.out.println(char1);
		System.out.println(char2);
		int count = 0;
		for (Character character : char1) {
			if (char2.contains(character)) {
				char2.remove(character);
				count++;
			}
		}
		return count;
	}

	String properNounCorrection(String noun) {
		String temp = noun.toLowerCase();
		if (temp.length() > 0) {
			char firstLetter = Character.toUpperCase(temp.charAt(0));
			return firstLetter + temp.substring(1);
		}
		return temp;
	}

	char lastDigitRegExp(String inputString) {
		List<Character> chars = new ArrayList<>();
		for (int i = inputString.length() - 1; i >= 0; i--) {
			chars.add(inputString.charAt(i));
		}
		System.out.println(chars);
		for (Character character : chars) {
			if (Character.isDigit(character)) {
				return character;
			}
		}
		return '0';
	}
	
	int sameElementsNaive(int[] a, int[] b) {
		List<Integer> tempA = new ArrayList<>();
		List<Integer> tempB = new ArrayList<>();
		for (int i : a) {
			tempA.add(i);
		}
		for (int i : b) {
			tempB.add(i);
		}
		int count = 0;
		for (Integer integer : tempA) {
			if (tempB.contains(integer)) {
				tempB.remove(integer);
				count++;
			}
		}
		return count;
	}
	
	int sumOfDivisors(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		return sum;
	}
	
	int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
		int height = 0;
		int count = 0;
		while (true) {
			count++;
			height += upSpeed;
			if (height >= desiredHeight) {
				return count;
			}
			height -= downSpeed;
		}
	}
	
	boolean isIdentityMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j && matrix[i][j] != 1) {
					return false;
				} else if (matrix[i][j] != 0) {
					return false;
				}
			}
		}
		return false;
	}
}
