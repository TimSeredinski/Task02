package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Criteria<E> {

	//Class searchType
	private Map<E, Object> criteria = new LinkedHashMap<>();
	private final Class<E> searchType;

	public Criteria(Class<E> cls) {
		searchType = cls;
	}

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Class<E> getSearchType() {
		return searchType;
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}

	// you may add your own code here

}
