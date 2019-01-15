package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.datareader.ReaderFromFile;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO {

    //открыть файл
    //прочитать данные из файла
    //выбрать только те по которым нужно вести поиск
    //замечание: файл читается каждый раз при обращении к методу find

    @Override
    public <E> List<Appliance> find(Criteria<E> criteria) {
        List<Appliance> appliances = new ArrayList<>();
        String className = criteria.getSearchType().getName();
        className = className.substring(className.lastIndexOf("$") + 1);
        List<String> result = ReaderFromFile.readFromFile(className);

        String regularExpression = getRegEx(criteria);
        System.out.println(regularExpression);
        result = getCorrectStringOfAppliance(result, regularExpression);
        System.out.println(result);
        ApplianceCreatorImpl creator = new ApplianceCreatorImpl();
        for (String str : result) {
            appliances.add(creator.createApplianceFromString(str, className));
        }
        return appliances;
    }

    private <E> String getRegEx(Criteria<E> criteria) {
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

    private List<String> getCorrectStringOfAppliance(List<String> listOfAppliance, String regEx) {
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

}