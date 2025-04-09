package tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntValidator {

    private static final String REGEX = "^([1-9][0-9]?|0)$";
    private static final Pattern pattern = Pattern.compile(REGEX);

    public static boolean isValid(String numberAsString) {
        Matcher matcher = pattern.matcher(numberAsString);
        return matcher.matches();
    }
}