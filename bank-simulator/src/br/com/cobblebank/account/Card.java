package br.com.cobblebank.account;

import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.stream.Collectors;

//TODO subistituir year e month por dataDeValidade
//TODO adiciona a escolha se o cartão é debito ou credito ou ambos
public class Card implements Serializable {
  private int limite;
  private String dataDeValidade;
  private int[] cardNumbers = new int[16];
  private int[] secureNumbers = new int[3];
  enum functions {
    CREDIT, DEBIT
  }
  private EnumSet<functions> functionsCard;

  public Card(functions function) {
    this.cardNumbers = Tools.generateCardNumbers();
    this.dataDeValidade = Tools.generateDataDeVali();
    this.secureNumbers = Tools.generateSecureNumbers();
    functionsCard = EnumSet.noneOf(functions.class);
    functionsCard.add(function);
  }

  public EnumSet<functions> getFunctionsCard() {
    return functionsCard;
  }

  public void setFunctionsCard(EnumSet<functions> functionsCard) {
    this.functionsCard = functionsCard;
  }

  public String getSecureNumbers()
  {
    return Arrays.stream(secureNumbers)
            .mapToObj(Integer::toString)
            .collect(Collectors.joining(""));
  }

  public String getCardNumbers()
  {
    return Arrays.stream(cardNumbers)
            .mapToObj(Integer::toString)
            .collect(Collectors.joining(""));
  }

}
