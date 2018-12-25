package by.tc.task01.entity;

import java.util.LinkedHashMap;
import java.util.Map;

public class ApplianceMap<E> {

    private Map<E, Object> mapOfAppliance = new LinkedHashMap<>();

    public void add(E searchCriteria, Object value) {
        mapOfAppliance.put(searchCriteria, value);
    }

    public Map<E, Object> getMap() {
        return mapOfAppliance;
    }

}
