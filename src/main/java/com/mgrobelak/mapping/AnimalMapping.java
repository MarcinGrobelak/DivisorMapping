package com.mgrobelak.mapping;

/**
 * @author Marcin Grobelak
 */

import java.util.HashMap;

public class AnimalMapping extends Mapping {

	public AnimalMapping() {
		mapping = new HashMap<>();
		mapping.put(1, "Mouse");
		mapping.put(2, "Cat");
		mapping.put(3, "Dog");
		mapping.put(4, "Elephant");
		mapping.put(5, "Spider");
		mapping.put(6, "Horse");
		mapping.put(7, "Monkey");
		mapping.put(8, "Lion");
		mapping.put(9, "Porcupine");
		mapping.put(10, "Human");
	}
}
