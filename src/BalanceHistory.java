import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class BalanceHistory extends JFrame {
    public List<Integer> historyDeposit = new ArrayList<>();
    public List<Integer> historywithdrawal = new ArrayList<>();
    public List<String> historyDepositDateHours = new ArrayList<>();
    public List<String> historywithdrawalDateHours = new ArrayList<>();
    public JButton
    public BalanceHistory()
    {
        super("Balance History");
        setLayout(new FlowLayout());

    }
    public String Make(int tipo, int valor)
    {
        LocalDateTime time = LocalDateTime.now();
        if (tipo == 1)
        {
            int year = time.getYear(), mes = time.getMonthValue(), day = time.getDayOfMonth(), hora = time.getHour(), min = time.getMinute();
            historyDepositDateHours.add(day + "/" + mes + "/" + year + " " + hora + ":" + min);
            historyDeposit.add(valor);
        }
        else
        {
            int year = time.getYear(), mes = time.getMonthValue(), day = time.getDayOfMonth(), hora = time.getHour(), min = time.getMinute();
            historywithdrawalDateHours.add(day + "/" + mes + "/" + year + " " + hora + ":" + min);
            historywithdrawal.add(valor);
        }
        return null;
    }
    public void exibir(List<Integer> his, List<String> date)
    {
        for (int i = 0; i < his.size(); i++)
        {
            System.out.println("Foi depositado : " + his.get(i) + "$" + " Na data e hora : " + date.get(i));
        }
    }
}
