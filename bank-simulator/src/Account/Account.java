package Account;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Account
{
    private int balance;
    private final int specialWithdrawal = 200;
    private boolean block = false;
    private final String name;
    private final String date;
    private final int year;
    private final int month;
    private final int[] cardNumbers = new int[16];
    private final int[] secureNumbers = new int[3];

    public Account(String name)
    {
        SecureRandom random = new SecureRandom();
        
        this.name = name;
        year = LocalDateTime.now().getYear() + 1 + random.nextInt(8);
        month = LocalDateTime.now().getMonthValue() + 1 + random.nextInt(12);
        date = month + "/" + year;
        
        IntStream.range(0, 16).forEach(i -> {
                    int num = 1 + random.nextInt(9);
                    cardNumbers[i] = num;
        });
        
        IntStream.range(0, 3).forEach(i -> {
            int num = 1 + random.nextInt(9);
            secureNumbers[i] = num;
        });
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

    public String getName()
    {
        return name;
    }
    public String getDate()
    {
        return date;
    }

    public int getBalance() {
        return balance;
    }

    public int getSpecialWithdrawal() {
        return specialWithdrawal;
    }

    public boolean isBlock() {
        return block;
    }
}
