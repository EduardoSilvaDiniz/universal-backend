package br.com.cobblebank.account;

import java.io.Serializable;

public class User implements Serializable {
  private String firstName;
  private String lastName;
  private String endereco;
  private int dataDeNacimento;
  private int CPF;

  public User(String firstName) {
    this.firstName = firstName;
  }

  public User(String firstName, String lastName, String endereco, int dataDeNacimento, int CPF) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.endereco = endereco;
    this.dataDeNacimento = dataDeNacimento;
    this.CPF = CPF;
  }

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

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public int getDataDeNacimento() {
    return dataDeNacimento;
  }

  public void setDataDeNacimento(int dataDeNacimento) {
    this.dataDeNacimento = dataDeNacimento;
  }

  public int getCPF() {
    return CPF;
  }

  public void setCPF(int CPF) {
    this.CPF = CPF;
  }

}
