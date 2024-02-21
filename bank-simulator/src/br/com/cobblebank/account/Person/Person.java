package br.com.cobblebank.account.Person;

import java.io.Serializable;

public abstract class Person implements Serializable {
  protected String firstName;
  protected String lastName;
  protected String address;
  protected int DateOfBirth;
  protected String contact;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getDateOfBirth() {
    return DateOfBirth;
  }

  public void setDateOfBirth(int dateOfBirth) {
    DateOfBirth = dateOfBirth;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }
}
