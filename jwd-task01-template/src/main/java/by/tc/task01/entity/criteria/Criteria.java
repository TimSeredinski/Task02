package by.tc.task01.entity.criteria;

import by.tc.task01.entity.ApplianceMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Criteria<E> extends ApplianceMap {

	//Class searchType
	private final Class<E> searchType;

	public Criteria(Class<E> cls) {
		searchType = cls;
	}

	public Class<E> getSearchType() {
		return searchType;
	}

	// you may add your own code here

}
