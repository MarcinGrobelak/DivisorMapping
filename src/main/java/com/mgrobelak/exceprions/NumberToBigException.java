package com.mgrobelak.exceprions;

/**
 * @author Marcin Grobelak
 */

public class NumberToBigException extends Exception {

	private static final long serialVersionUID = -1932490691198389874L;

	@Override
	public String getMessage() {
		return "Number has to be in 1 to 10 range.";
	}
}
