package br.com.michel.validations.validation.ddd;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DDDValidator implements ConstraintValidator<DDD, String> {

    private final Pattern PATTERN = Pattern.compile("([0-9]{2})");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value != null) {
            Matcher matcher = PATTERN.matcher(value);
            return matcher.matches();
        }
        return true;
    }
}