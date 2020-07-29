package com.mgrobelak.exceprions;

/**
 * @author Marcin Grobelak
 */

public class NumbersNotFoundException extends Exception {

	private static final long serialVersionUID = -1552898407090306044L;

	@Override
	public String getMessage() {
		return "Numbers not found.";
	}
}
