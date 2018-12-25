package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ApplianceDAOImpl implements ApplianceDAO {

    //открыть файл
    //прочитать данные из файла
    //выбрать только те по которым нужно вести поиск
    //замечание: файл читается каждый раз при обращении к методу find

    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        List<Appliance> appliances = new ArrayList<>();
        String className = criteria.getSearchType().getName();
        //System.out.println(criteria.getSearchType().getClass().);
        className = className.substring(className.lastIndexOf("$") + 1);
        Pattern pattern = Pattern.compile(className + " : .*");
        Matcher matcher;
        List<String> result = new ArrayList<>();

        try {
            List<String> allLines = Files.lines(Paths.get("src/main/resources/appliances_db.txt")).collect(Collectors.toList());
            for (String s : allLines) {
                matcher = pattern.matcher(s);
                if (matcher.find()) {
                    result.add(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String regularExpression = getRegEx(criteria, result.get(0));
        System.out.println(regularExpression);

        result = getCorrectStringOfAppliance(result, regularExpression);
        System.out.println(result);
        for (String str : result) {
            appliances.add(createApplianceFromString(str, className));
        }
        System.out.println();
        return null;
    }

    private <E> String getRegEx(Criteria<E> criteria, String str) {
        StringBuilder regEx = new StringBuilder();
        Iterator iteratorForKeys = criteria.getCriteria().keySet().iterator();
        Iterator iteratorForValues = criteria.getCriteria().values().iterator();
        regEx.append(".*");
        while (iteratorForKeys.hasNext()) {
            String key = iteratorForKeys.next().toString();
            String value = iteratorForValues.next().toString();
            regEx.append(key + "=" + value + ".*");
        }
        return regEx.toString();
    }

    private <E> List<String> getCorrectStringOfAppliance(List<String> listOfAppliance, String regEx) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher;
        for (String str : listOfAppliance) {
            matcher = pattern.matcher(str);
            if (matcher.find()) {
                result.add(str);
            }
        }
        return result;
    }

    private <E> Appliance createApplianceFromString(String str, String className) {
        Appliance appliance;
        List<String> arrayOfValues = getArrayOfValues(str);
        System.out.println(arrayOfValues);
        getMapOfAppliance(arrayOfValues);
//        switch (className) {
//            case ("Oven"):
//                appliance = new Oven();
//                String[] arrayOfOvenEnums = Arrays.stream(SearchCriteria.Oven.values()).map(Enum::name)
//                        .collect(Collectors.toList()).toArray(new String[0]);
//                parseStringWithEnum(str, arrayOfOvenEnums, appliance);
//                break;
//            case ("Laptop"):
//                appliance = new Laptop();
//                String[] arrayOfLaptopEnums = Arrays.stream(SearchCriteria.Laptop.values()).map(Enum::name)
//                        .collect(Collectors.toList()).toArray(new String[0]);
//                parseStringWithEnum(str, arrayOfLaptopEnums, appliance);
//                break;
//            case ("Speakers"):
//                appliance = new Speakers();
//                String[] arrayOfSpeakersEnums = Arrays.stream(SearchCriteria.Speakers.values()).map(Enum::name)
//                        .collect(Collectors.toList()).toArray(new String[0]);
//                parseStringWithEnum(str, arrayOfSpeakersEnums, appliance);
//                break;
//            case ("Refrigerator"):
//                appliance = new Refrigerator();
//                String[] arrayOfRefrigeratorEnums = Arrays.stream(SearchCriteria.Refrigerator.values()).map(Enum::name)
//                        .collect(Collectors.toList()).toArray(new String[0]);
//                parseStringWithEnum(str, arrayOfRefrigeratorEnums, appliance);
//                break;
//            case ("TabletPC"):
//                appliance = new TabletPC();
//                String[] arrayOfTabletPCEnums = Arrays.stream(SearchCriteria.TabletPC.values()).map(Enum::name)
//                        .collect(Collectors.toList()).toArray(new String[0]);
//                parseStringWithEnum(str, arrayOfTabletPCEnums, appliance);
//                break;
//            case ("VacuumCleaner"):
//                appliance = new VacuumCleaner();
//                String[] arrayOfVacuumCleanerEnums = Arrays.stream(SearchCriteria.VacuumCleaner.values()).map(Enum::name)
//                        .collect(Collectors.toList()).toArray(new String[0]);
//                parseStringWithEnum(str, arrayOfVacuumCleanerEnums, appliance);
//                break;
//        }

        return null;
    }

    private <E> Appliance getMapOfAppliance(List<String> arrayOfValues) {
        Pattern pattern = Pattern.compile("^\\d+$");
        Matcher matcher;
        List<Integer> arrayOfIntegerValues = new ArrayList<>();
        List<String> arrayOfStringValues = new ArrayList<>();
        for(String s : arrayOfValues){
            matcher = pattern.matcher(s);
            if (matcher.find()){
                arrayOfIntegerValues.add(Integer.valueOf(s));
            }
            else {
                arrayOfStringValues.add(s);
            }
        }
        System.out.println("Strings " + arrayOfStringValues);
        System.out.println("Integers " + arrayOfIntegerValues);
        return null;
    }

    private List<String> getArrayOfValues(String str) {
        List<String> s = new ArrayList<>();
        Pattern pattern = Pattern.compile("=[0-9a-zA-Z-\\.]{0,10}[,|\\s|;]?");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            s.add(matcher.group().trim().replaceAll("[^0-9a-zA-Z-\\.]", ""));
        }
        return s;
    }


}


//you may add your own new classes