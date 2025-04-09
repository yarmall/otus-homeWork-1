package tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator {

    public static String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    private static final String NAME_REGEX = "^[а-яА-ЯёЁ]+$"; //

    public static boolean isValid(String name) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
