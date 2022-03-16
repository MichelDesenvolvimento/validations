package br.com.michel.validations.validation.phone;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator implements ConstraintValidator<Phone, String> {

    private final Pattern PATTERN = Pattern.compile("([0-9]{4}-?[0-9]{4}[0-9]?)");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value != null) {
            Matcher matcher = PATTERN.matcher(value);
            return matcher.matches();
        }
        return true;
    }
}