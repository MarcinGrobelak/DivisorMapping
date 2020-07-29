package com.mgrobelak.mapping;

/**
 * @author Marcin Grobelak
 */

import java.util.HashMap;

public class InstrumentMapping extends Mapping {

	public InstrumentMapping() {
		mapping = new HashMap<>();
		mapping.put(1, "Guitar");
		mapping.put(2, "Piano");
		mapping.put(3, "Drums");
		mapping.put(4, "Synthesizer");
		mapping.put(5, "Bass guitar");
		mapping.put(6, "Tringle");
		mapping.put(7, "Cello");
		mapping.put(8, "Saxophone");
		mapping.put(9, "Djembe");
		mapping.put(10, "Violin");
	}
}
