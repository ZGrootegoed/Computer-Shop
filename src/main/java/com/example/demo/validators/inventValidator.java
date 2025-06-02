package com.example.demo.validators;

import com.example.demo.domain.Part;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class inventValidator implements ConstraintValidator<inventCheck, Part> {

    @Override
    public void initialize(inventCheck constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {

        if (part.getInv() < part.getMinInv() || part.getInv() > part.getMaxInv()) {
            return false;
        }
        else return true;
    }
}
