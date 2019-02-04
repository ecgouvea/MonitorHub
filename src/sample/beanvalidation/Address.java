package sample.beanvalidation;

import javax.validation.constraints.NotNull;

@AddressValidation
public class Address {

  private String street;

  @NotNull(message = "Number must not be null")
  private Integer number;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }
}
