import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Data
{
    private final String name;
    private final String date;
    private final List<Integer> cardNumbers = new ArrayList<Integer>();
    private final List<Integer> secureNumbers = new ArrayList<Integer>();

    public Data(String name)
    {
        this.name = name;
        LocalDateTime time = LocalDateTime.now();
        int year = time.getYear(), mes = time.getMonthValue();
        date = (mes + 3) + "/" + (year + 5);
        Random random = new Random();
        for (int i = 0; i < 16; i++)
        {
            Integer num = random.nextInt(10);
            cardNumbers.add(num);
        }
        for (int i = 0; i < 3; i++)
        {
            Integer num = random.nextInt(10);
            secureNumbers.add(num);
        }
    }
    public String getName()
    {
        return name;
    }
    public String getDate()
    {
        return date;
    }
    public StringBuilder getCardNumbers()
    {
        StringBuilder text = new StringBuilder();
        for (Integer a : cardNumbers)
            text.append(String.valueOf(a));
        return text;
    }
    public StringBuilder getSecureNumbers()
    {
        StringBuilder text = new StringBuilder();
        for (Integer a : secureNumbers)
            text.append(String.valueOf(a));
        return text;
    }
}
