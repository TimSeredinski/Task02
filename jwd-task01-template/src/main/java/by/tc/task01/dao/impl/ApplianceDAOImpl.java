package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
        className = className.substring(className.lastIndexOf("$") + 1);
        //System.out.println(className);
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
        for(String str : result){
            createApplianceFromString(str);
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

    private <E> List<String> getCorrectStringOfAppliance(List<String> listOfAppliance, String regEx){
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher;
        for (String str : listOfAppliance){
            matcher = pattern.matcher(str);
            if (matcher.find()){
                result.add(str);
            }
        }
        return result;
    }

    private <E> Appliance createApplianceFromString(String str){
        System.out.println("Строка которую будем парсить - " + str);
        return null;
    }
}


//you may add your own new classes