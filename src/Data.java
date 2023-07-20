import javax.swing.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Data
{
    public String name, date;
    public List<Long> cardNumbers = new ArrayList<>();
    public List<Long> segureNumbers = new ArrayList<>();

    public Data()
    {
        name = JOptionPane.showInputDialog(null, "Whats is your name?");
        LocalDateTime time = LocalDateTime.now();
        int year = time.getYear(), mes = time.getMonthValue();
        date = (mes + 3) + "/" + (year + 5);
    }

    private void gerarCartao()
    {
        Random random = new Random();
        for (int i = 0; i < 16; i++)
        {
            long num = random.nextInt(10);
            this.cardNumbers.add(num);
        }
        for (int i = 0; i < 3; i++)
        {
            long num = random.nextInt(10);
            this.segureNumbers.add(num);
        }
        String message = String.format("A new card is create, numbers is: %s, end Secure Numbers is: %s", cardNumbers, segureNumbers);
        JOptionPane.showMessageDialog(null, message);
    }
}
