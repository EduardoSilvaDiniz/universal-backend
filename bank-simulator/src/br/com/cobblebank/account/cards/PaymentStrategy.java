package br.com.cobblebank.account.cards;
//TODO criar uma interface para controlar o cartao de credito e debito
//TODO aprender a usar o tipo interface

public interface PaymentStrategy {
    void pay(double amount);
}

