import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class BalanceHistory extends JFrame {

    private ArrayList<String> historywithdrawal = new ArrayList<>();
    private ArrayList<String> historyDeposit = new ArrayList<>();
    private StringBuilder historicoTexto = new StringBuilder();
    private LocalDateTime dateTime = LocalDateTime.now();
    private JLabel label = new JLabel();

    public BalanceHistory()
    {
        super("History Balance");
        setLayout(new FlowLayout());
    }

    public void addHistoryWithdrawal(String his)
    {
        // Adiciona data e hora junto e o indentificador withdrawal
        his = String.format("withdrawal,%s,%s/%s/%s,%s:%s", his, dateTime.getDayOfMonth(), dateTime.getMonthValue(),
                                                            dateTime.getYear(), dateTime.getHour(), dateTime.getMinute());
        // Adiciona ao arraylist
        historywithdrawal.add(his);
    }

    public void addHistoryDeposit(String his)
    {
        // Adiciona data e hora junto e o indentificador deposit
        his = String.format("deposit,%s,%s/%s/%s,%s:%s", his, dateTime.getDayOfMonth(), dateTime.getMonthValue(),
                                                         dateTime.getYear(), dateTime.getHour(), dateTime.getMinute());
        // Adiciona ao arraylist
        historyDeposit.add(his);
    }

    public void updateLabel()
    {
        // Reiniciando StringBuilder e label para evitar mostrar valores repetidos
        historicoTexto.setLength(0);
        label.setText("");

        // Concatenando todos os elementos do arraylist em um stringbuilder para exibir no label
        for (String pagamento : historywithdrawal)
        {
            historicoTexto.append(String.format("$%s withdrawal\n", pagamento)).append("<br>"); // tags html para adiciona quebra de linha
        }
        label = new JLabel("<html>" + historicoTexto.toString() + "</html>"); // tags html para funciona <br>

        // Adicionando o novo label
        add(label);

        // Recarregando o label
        revalidate();
    }
}
