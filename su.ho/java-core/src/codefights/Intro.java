package codefights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
		List<Integer> availableInput = input.stream().filter(Predic.availableValue()).collect(Collectors.toList());
		for (int i = 0; i < input.size(); i++) {
			if (input.get(i) == -1) {
				indexs.add(i);
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
		List<Integer> input = Arrays.asList(-1, 150, 190, 170, -1, -1, 160, 180);
		List<Integer> output = intro.sortByHeight(input);
		for (int i : output) {
			System.out.print(i + " ");
		}
	}

}
