package br.com.cobblebank.account.cards;

public class CreditCard implements PaymentStrategy {
  private int limitMax;
  private int limitAvailable;
  private int currentInvoice;

  public CreditCard()
  {
    limitMax = 200;
  }
  public String getBalance()
  {
    return String.format("$%d Current invoice, $%d Limit credit Available", currentInvoice, limitAvailable);
  }

  public int getLimitMax() {
    return limitMax;
  }

  public void setLimitMax(int limitMax) {
    this.limitMax = limitMax;
  }

  @Override
  public void pay(double amount) {
    
  }
}
