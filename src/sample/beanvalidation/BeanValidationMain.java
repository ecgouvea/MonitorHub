package sample.beanvalidation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class BeanValidationMain {

  public static void main(String[] args) {
    Address address = new Address();
    address.setStreet("abc st");

    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();

    Set<ConstraintViolation<Address>> violations = validator.validate(address);
    violations.stream().forEach(System.out::println);
    //System.out.println("violations = [" + violations + "]");
  }
}
