package com.mgrobelak.exceprions;

/**
 * @author Marcin Grobelak
 */

public class MappingNotFoundException extends Exception {

	private static final long serialVersionUID = -2732263655704110339L;

	@Override
	public String getMessage() {
		return "Mapping not found.";
	}
}
