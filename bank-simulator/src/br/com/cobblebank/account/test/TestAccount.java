package br.com.cobblebank.account.test;

import br.com.cobblebank.account.Account;

public class TestAccount {
  public static void main(String[] args) {
    Account account = new Account("Edu");
    System.out.println(account.card.getCardNumbers());
    System.out.println(account.user.getFirstName());
    System.out.println(account.card.getFunctionsCard());
  }
}
