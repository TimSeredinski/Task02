package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;

public interface ApplianceCreator {
    Appliance createApplianceFromString(String str, String className);
}
