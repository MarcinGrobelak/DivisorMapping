package com.mgrobelak.model;

/**
 * @author Marcin Grobelak
 */

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestOutput {

	private Integer number;
	private List<String> words = new ArrayList<>();

	public RequestOutput() {

	}

	public RequestOutput(Integer number, List<String> words) {
		super();
		this.number = number;
		this.words = words;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public List<String> getWords() {
		return words;
	}

	public void setWords(List<String> words) {
		this.words = words;
	}

}
