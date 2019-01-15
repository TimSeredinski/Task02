package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceCreator;
import by.tc.task01.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceCreatorImpl implements ApplianceCreator {

    @Override
    public Appliance createApplianceFromString(String str, String className) {
        List<String> arrayOfValues = getArrayOfValues(str);
        System.out.println(arrayOfValues);
        return getApplianceFromStringArrayOfValues(arrayOfValues, className);
    }

    private Appliance getApplianceFromStringArrayOfValues(List<String> arrayOfValues, String className) {
        Appliance appliance = null;
        Pattern pattern = Pattern.compile("^\\d+$");
        Matcher matcher;
        List<Integer> arrayOfIntegerValues = new ArrayList<>();
        List<String> arrayOfStringValues = new ArrayList<>();
        for (String s : arrayOfValues) {
            matcher = pattern.matcher(s);
            if (matcher.find()) {
                arrayOfIntegerValues.add(Integer.valueOf(s));
            } else {
                arrayOfStringValues.add(s);
            }
        }
        System.out.println("Strings " + arrayOfStringValues);
        System.out.println("Integers " + arrayOfIntegerValues);
        switch (className) {
            case ("Oven"):
                appliance = new Oven(arrayOfIntegerValues, arrayOfStringValues);
                break;
            case ("Laptop"):
                appliance = new Laptop(arrayOfIntegerValues, arrayOfStringValues);
                break;
            case ("Speakers"):
                appliance = new Speakers(arrayOfIntegerValues, arrayOfStringValues);
                break;
            case ("Refrigerator"):
                appliance = new Refrigerator(arrayOfIntegerValues, arrayOfStringValues);
                break;
            case ("TabletPC"):
                appliance = new TabletPC(arrayOfIntegerValues, arrayOfStringValues);
                break;
            case ("VacuumCleaner"):
                appliance = new VacuumCleaner(arrayOfIntegerValues, arrayOfStringValues);
                break;
        }
        return appliance;
    }

    private List<String> getArrayOfValues(String str) {
        List<String> s = new ArrayList<>();
        Pattern pattern = Pattern.compile("=[0-9a-zA-Z-\\.]{0,10}[,|\\s|;]?");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            s.add(matcher.group().trim().replaceAll("[^0-9a-zA-Z-\\.]", ""));
        }
        return s;
    }
}
