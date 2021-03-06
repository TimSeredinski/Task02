package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.exception.InvalidCriteriaException;

import java.util.List;

public interface ApplianceService {	
	
	<E> List<Appliance> find(Criteria<E> criteria) throws InvalidCriteriaException;
	
}
