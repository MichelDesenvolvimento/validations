package br.com.michel.validations.validation.ddd;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = DDDValidator.class)
@Documented
public @interface DDD {

    String message() default "DDD inválido";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
