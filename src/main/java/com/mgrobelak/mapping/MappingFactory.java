package com.mgrobelak.mapping;

/**
 * @author Marcin Grobelak
 */

public class MappingFactory {

	public static Mapping produceMapping(String type) {

		if (type.equals("ANIMALS")) {
			return new AnimalMapping();
		}

		if (type.equals("FURNITURE")) {
			return new FurnitureMapping();
		}

		if (type.equals("INSTRUMENT")) {
			return new FurnitureMapping();
		}

		return null;
	}
}
