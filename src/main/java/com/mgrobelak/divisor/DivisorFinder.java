package com.mgrobelak.divisor;

/**
 * @author Marcin Grobelak
 */

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class DivisorFinder {

	public static List<Integer> getDivisors(Integer number) {
		SortedSet<Integer> divisors = new TreeSet<>();
		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				divisors.add(i);
				divisors.add(number / i);
			}
		}
		return new ArrayList<>(divisors);
	}
}
