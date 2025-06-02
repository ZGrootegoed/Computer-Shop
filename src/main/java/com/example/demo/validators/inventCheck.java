package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Constraint(validatedBy = {inventValidator.class})
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface inventCheck {
    String message() default "Check Inventory, must be between Minimum and Maximum";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
