package codefights.java;

import java.util.Arrays;
import java.util.List;

public class CodeFights {

	boolean isIncreasingDigitsSequence(int n) {
		String value = Integer.toString(n);
		String[] strs = value.split("");
		String first = strs[0];
		for (int i = 1; i < strs.length; i++) {
			int a = Integer.parseInt(first);
			int b = Integer.parseInt(strs[i]);
			if (b == a || a > b) {
				return false;
			}
		}
		return true;
	}

	boolean sameDigitNumber(int n) {
		String value = Integer.toString(n);
		char first = value.charAt(0);
		for (char c : value.toCharArray()) {
			if (first != c) {
				return false;
			}
		}
		return true;
	}

	int commonCharacterCount(String s1, String s2) {
		List<String> s1c = Arrays.asList(s1.split(","));
		List<String> s2c = Arrays.asList(s2.split(","));
		int count = 0;
		for (String str : s1c) {
			if (s2c.contains(str)) {
				count += 1;
				s2c.remove(s2c.indexOf(str));
			}
		}
		return count;
	}

	String properNounCorrection(String noun) {
		String[] strs = noun.split("");
		for (int i = 0; i < strs.length; i++) {
			if (i == 0) {
				strs[i] = strs[i].toUpperCase();
			} else {
				strs[i] = strs[i].toLowerCase();
			}
		}
		return (String) Arrays.toString(strs);
	}

	char lastDigitRegExp(String inputString) {
		String value = inputString.replaceAll("\\D+", "");
		int l = value.length();
		return value.charAt(l - 1);
	}

	int sameElementsNaive(int[] a, int[] b) {
		String a1 = Arrays.toString(a);
		String a2 = Arrays.toString(b);
		List<String> list1 = Arrays.asList(a1);
		List<String> list2 = Arrays.asList(a2);
		int count = 0;
		for (String str : list1) {
			if (list2.contains(str)) {
				count += 1;
				list2.remove(list2.indexOf(str));
			}
		}
		return count;
	}

	int sumOfDivisors(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count += i;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		CodeFights o = new CodeFights();
		System.out.println(o.sumOfDivisors(12));
	}
}
