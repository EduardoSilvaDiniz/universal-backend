package br.com.cobblebank.account;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.stream.IntStream;

public class Tools {

  static SecureRandom random = new SecureRandom();

  public static String generateDataDeVali(){
    int year = LocalDateTime.now().getYear() + 1 + random.nextInt(8);
    int month = LocalDateTime.now().getMonthValue() + 1 + random.nextInt(12);
    return month + "/" + year;
  }

  public static int[] generateCardNumbers() {
    int[] cardNumbers = new int[16];

    IntStream.range(0, 16).forEach(i -> {
      int num = 1 + random.nextInt(9);
      cardNumbers[i] = num;
    });

    return cardNumbers;
    }

    public static int[] generateSecureNumbers() {
    int[] secureNumbers = new int[3];

    IntStream.range(0, 3).forEach(i -> {
      int num = 1 + random.nextInt(9);
      secureNumbers[i] = num;
    });

    return secureNumbers;
    }
}
