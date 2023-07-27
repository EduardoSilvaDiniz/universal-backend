import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BalanceHistory extends JFrame {

    private final List<String> historywithdrawal = new ArrayList<String>();
    private final List<String> historyDeposit = new ArrayList<String>();
    private final List<String> historyGeneric = new ArrayList<String>();
    private final StringBuilder Text = new StringBuilder();
    private final LocalDateTime dateTime = LocalDateTime.now();
    private JLabel label = new JLabel();

    public BalanceHistory()
    {
        super("History Balance");
        setLayout(new FlowLayout());
    }

    public void addHistoryWithdrawal(String his, int balance)
    {
        // Adiciona data e hora juntamente com o tipo de execução
        his = String.format("$%s,  Date: %s/%s/%s, Time: %s:%s, withdrawal. Balance Account: %d", his, dateTime.getDayOfMonth(), dateTime.getMonthValue(),
                                                                                                dateTime.getYear(), dateTime.getHour(), dateTime.getMinute(), balance);
        // Adiciona a variável
        historywithdrawal.add(his);
    }

    public void addHistoryDeposit(String his, int balance)
    {
        // Adiciona data e hora juntamente com o tipo de execução
        his = String.format("$%s,  Date: %s/%s/%s, Time: %s:%s, deposit. Balance Account: %d", his, dateTime.getDayOfMonth(), dateTime.getMonthValue(),
                                                                                             dateTime.getYear(), dateTime.getHour(), dateTime.getMinute(), balance);
        // Adiciona a variável
        historyDeposit.add(his);
    }

    public void addHistoryGeneric(String resp, int balance, String type)
    {
        // Adiciona data e hora juntamente com o tipo de execução
        resp = String.format("$%s,  Date: %s/%s/%s, Time: %s:%s, %s. Balance Account: %d", resp, dateTime.getDayOfMonth(), dateTime.getMonthValue(),
                                                                                        dateTime.getYear(), dateTime.getHour(), dateTime.getMinute(), type, balance);
        // Adiciona a variável
        historyGeneric.add(resp);
    }


    public void updateLabel()
    {
        // Reiniciando StringBuilder e label para evitar mostrar valores repetidos
        Text.setLength(0);
        label.setText("");

        // Concatenando todos os elementos do variável em um StringBuilder para exibir no JLabel
        for (String pay : historyGeneric)
            Text.append(pay).append("<br>"); // quebra de linha com HTML

        label = new JLabel("<html>" + Text + "</html>"); // Usando tags HTML para exibir quebras de linha no texto

        // Atualizado label
        add(label);

        // Recarregando a interface
        revalidate();
    }
}
