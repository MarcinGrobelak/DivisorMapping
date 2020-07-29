package com.mgrobelak.mapping;

/**
 * @author Marcin Grobelak
 */

import java.util.HashMap;

public class FurnitureMapping extends Mapping {

	public FurnitureMapping() {
		mapping = new HashMap<>();
		mapping.put(1, "Chair");
		mapping.put(2, "Table");
		mapping.put(3, "Lamp");
		mapping.put(4, "Bed");
		mapping.put(5, "Couch");
		mapping.put(6, "Bench");
		mapping.put(7, "Cabinet");
		mapping.put(8, "Desk");
		mapping.put(9, "Closet");
		mapping.put(10, "Shelf");
	}
}
