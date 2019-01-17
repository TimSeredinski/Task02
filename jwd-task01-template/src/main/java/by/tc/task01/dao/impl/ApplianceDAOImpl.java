package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.datareader.ReaderFromFile;
import by.tc.task01.dao.parser.ParserWithCriteria;
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
        ParserWithCriteria parser = new ParserWithCriteria();
        ApplianceCreatorImpl creator = new ApplianceCreatorImpl();
        String className = criteria.getSearchType().getName();
        className = className.substring(className.lastIndexOf("$") + 1);
        List<String> result = ReaderFromFile.readFromFile(className);
        String regularExpression = parser.createRegularExpressionWithCriteria(criteria);
        result = parser.searchAppliances(result, regularExpression);
        for (String str : result) {
            appliances.add(creator.createApplianceFromString(str, className));
        }
        return appliances;
    }

}