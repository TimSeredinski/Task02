package by.tc.task01.dao.datareader;

import by.tc.task01.dao.impl.ApplianceDAOImpl;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReaderFromFile {

    public static List<String> readFromFile(String className) {
        Pattern pattern = Pattern.compile(className + " : .*");
        Matcher matcher;
        List<String> result = new ArrayList<>();

        try {
            URL resource = ApplianceDAOImpl.class.getResource("/appliances_db.txt");
            List<String> allLines = Files.lines(Paths.get(resource.toURI()).toAbsolutePath()).collect(Collectors.toList());
            for (String s : allLines) {
                matcher = pattern.matcher(s);
                if (matcher.find()) {
                    result.add(s);
                }
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return result;
    }

}
