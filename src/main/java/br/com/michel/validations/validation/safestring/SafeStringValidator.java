package br.com.michel.validations.validation.safestring;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SafeStringValidator implements ConstraintValidator<SafeString, String> {

    private final Pattern PATTERN = Pattern.compile(".*<[^>]+>.*");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value != null) {
            Matcher matcher = PATTERN.matcher(value);
            return !matcher.matches();
        }
        return true;
    }
}