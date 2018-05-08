package codefights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Intro {

	/*
	 * Some people are standing in a row in a park. There are trees between them
	 * which cannot be moved. Your task is to rearrange the people by their heights
	 * in a non-descending order without moving the trees.
	 * 
	 * Example
	 * 
	 * For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
	 * sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
	 */
	List<Integer> sortByHeight(List<Integer> input) {
		List<Integer> indexs = new ArrayList<>();
		List<Integer> availableInput = new ArrayList<>();
		for (int i = 0; i < input.size(); i++) {
			if (input.get(i) == -1) {
				indexs.add(i);
			} else {
				availableInput.add(input.get(i));
			}
		}
		Collections.sort(availableInput);
		for (int i: indexs) {
			availableInput.add(i, -1);
		}
		return availableInput;
	}

	public static void main(String[] args) {
		Intro intro = new Intro();
		List<Integer> input = Arrays.asList(10, -1, 1, -1, -1, 2, 4, 3, -1, -1, 7, 5);
		List<Integer> output = intro.sortByHeight(input);
		for (int i : output) {
			System.out.println(i);
		}
	}

}
