package com.mgrobelak.model;

/**
 * @author Marcin Grobelak
 */

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestInput {

	private String mappingName;

	private List<Integer> numbers = new ArrayList<>();

	public RequestInput() {

	}

	public RequestInput(String mappingName, List<Integer> numbers) {
		this.mappingName = mappingName;
		this.numbers = numbers;
	}

	public String getMappingName() {
		return mappingName;
	}

	public void setMappingName(String mappingName) {
		this.mappingName = mappingName;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

}
