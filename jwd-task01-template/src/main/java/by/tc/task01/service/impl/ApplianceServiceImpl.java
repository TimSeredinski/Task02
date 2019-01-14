package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.exception.InvalidCriteriaException;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria) throws InvalidCriteriaException {
		if (!Validator.criteriaValidator(criteria)) {
			throw new InvalidCriteriaException("Wrong data for criteria");
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliances = applianceDAO.find(criteria);
		return appliances;
	}

}

