package com.mgrobelak.response.creator;

/**
 * @author Marcin Grobelak
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;

import org.apache.commons.collections4.CollectionUtils;

import com.mgrobelak.divisor.DivisorFinder;
import com.mgrobelak.exceprions.MappingNotFoundException;
import com.mgrobelak.exceprions.NumberToBigException;
import com.mgrobelak.exceprions.NumbersNotFoundException;
import com.mgrobelak.mapping.Mapping;
import com.mgrobelak.mapping.MappingFactory;
import com.mgrobelak.model.RequestInput;
import com.mgrobelak.model.RequestOutput;

@RequestScoped
public class ResponseEntityCreator {

	public List<RequestOutput> create(RequestInput input) throws Exception {
		List<RequestOutput> result = new ArrayList<>();

		Mapping mapping = getMapping(input.getMappingName());
		chceckNumbers(input.getNumbers());

		for (Integer number : input.getNumbers()) {
			result.add(createOutput(number, mapping));
		}

		return result;
	}

	private RequestOutput createOutput(Integer number, Mapping mapping) {
		List<Integer> divisors = DivisorFinder.getDivisors(number);
		Map<Integer, String> mappingList = mapping.getMapping();
		List<String> words = divisors.stream().map(n -> mappingList.get(n)).collect(Collectors.toList());
		return new RequestOutput(number, words);
	}

	private Mapping getMapping(String mappingName) throws MappingNotFoundException {
		if (mappingName == null) {
			throw new MappingNotFoundException();
		}

		Mapping mapping = MappingFactory.produceMapping(mappingName);
		if (mapping == null) {
			throw new MappingNotFoundException();
		}
		return mapping;
	}

	private void chceckNumbers(List<Integer> numbers) throws Exception {
		if (CollectionUtils.isEmpty(numbers)) {
			throw new NumbersNotFoundException();
		}

		for (Integer number : numbers) {
			if (number > 10) {
				throw new NumberToBigException();
			}
		}
	}

}
