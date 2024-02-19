package br.com.cobblebank.account.cards;

public class DebitCard implements PaymentStrategy {
  private int balance;
  public int getBalance()
  {
    return balance;
  }

  @Override
  public void pay(double amount) {

  }
}
