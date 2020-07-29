package com.mgrobelak.mapping;

/**
 * @author Marcin Grobelak
 */

import java.util.Map;

public abstract class Mapping {

	public Mapping() {
	}

	protected Map<Integer, String> mapping;

	public Map<Integer, String> getMapping() {
		return mapping;
	}
}
