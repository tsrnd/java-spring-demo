package codefights.java;

import java.util.function.Predicate;

public class Predic {
	public static Predicate<Integer> availableValue() {
	    return value -> value != -1;
	}
}
