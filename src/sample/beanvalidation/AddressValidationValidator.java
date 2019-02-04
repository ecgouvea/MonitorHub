package sample.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Validates if media asset exists.
 */
public class AddressValidationValidator implements ConstraintValidator<AddressValidation, Address> {

  /**
   * Constructor.
   */
  public AddressValidationValidator() {
  }

  @Override
  public void initialize(AddressValidation constraintAnnotation) {
  }

  @Override
  public boolean isValid(Address address, ConstraintValidatorContext context) {

    if(!address.getStreet().toUpperCase().equals(address.getStreet())) {
      context.disableDefaultConstraintViolation();
      context
          .buildConstraintViolationWithTemplate("Street must be all uppercase")
          .addConstraintViolation();

      return false;
    }
    return true;
  }
}
