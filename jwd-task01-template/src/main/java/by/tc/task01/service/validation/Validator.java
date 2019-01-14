package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Iterator;

public class Validator {

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {
        Iterator iteratorForValues = criteria.getCriteria().values().iterator();
        while (iteratorForValues.hasNext()) {
            if (iteratorForValues.next().toString().matches("^-[0-9\\.]*")) {
                return false;
            }
        }
        return true;
    }

}
