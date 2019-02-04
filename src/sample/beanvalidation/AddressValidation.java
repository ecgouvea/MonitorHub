package sample.beanvalidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Constraint on media asset.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AddressValidationValidator.class)
@Documented
public @interface AddressValidation {
  /**
   * Messages if validation fails.
   * @return message if validation fails
   */
  String message() default "Address not valid.";

  /**
   * constraint group.
   * @return constraint group
   */
  Class<?>[] groups() default {};

  /**
   * assign custom payload objects to a constraint.
   * @return payload
   */
  Class<? extends Payload>[] payload() default {};
}
