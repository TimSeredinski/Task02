package by.tc.task01.dao.parser;

import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserWithCriteria {

    public  <E> String createRegularExpressionWithCriteria(Criteria<E> criteria) {
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

    public List<String> searchAppliances(List<String> listOfAppliance, String regEx) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher;
        for (String str : listOfAppliance) {
            matcher = pattern.matcher(str);
            if (matcher.find()) {
                result.add(str);
            }
        }
        System.out.println(result);
        return result;
    }

}
