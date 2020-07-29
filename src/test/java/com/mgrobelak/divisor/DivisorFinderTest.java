package com.mgrobelak.divisor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DivisorFinderTest {

	@ParameterizedTest
	@MethodSource("divisors")
	void divisorTest(int number, List<Integer> divisors) {
		assertThat(DivisorFinder.getDivisors(number), is(equalTo(divisors)));
	}

	private static List<Arguments> divisors() {
		List<Arguments> args = new ArrayList<>();
		args.add(Arguments.of(1, Arrays.asList(1)));
		args.add(Arguments.of(2, Arrays.asList(1, 2)));
		args.add(Arguments.of(3, Arrays.asList(1, 3)));
		args.add(Arguments.of(4, Arrays.asList(1, 2, 4)));
		args.add(Arguments.of(5, Arrays.asList(1, 5)));
		args.add(Arguments.of(6, Arrays.asList(1, 2, 3, 6)));
		args.add(Arguments.of(7, Arrays.asList(1, 7)));
		args.add(Arguments.of(8, Arrays.asList(1, 2, 4, 8)));
		args.add(Arguments.of(9, Arrays.asList(1, 3, 9)));
		args.add(Arguments.of(10, Arrays.asList(1, 2, 5, 10)));
		return args;
	}
}
