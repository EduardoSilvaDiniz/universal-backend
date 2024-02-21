package br.com.cobblebank.account;

import java.io.Serializable;
import java.util.Scanner;

public class Account implements Serializable {
  private int agencia;
  private int conta;
  private int banco;
  private int saldo;
  private int dataCriado;
  private boolean block = false;
  public Card card;

  public Account(String name) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Seu cartão é credito, debito ou ambos?");
    String function = scanner.nextLine();
    card = new Card(Card.functions.CREDIT);
  }
}
