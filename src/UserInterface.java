import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame
{
    private JButton buttonCreateAccout,
                    buttonShowName,
                    buttonGetBalance,
                    buttonToDeposit,
                    buttonWithdrawal,
                    buttonUnblock,
                    buttonHistory;

    private BankAccount account;
    private BalanceHistory balancehistory = new BalanceHistory();
    private String resp;
    public UserInterface()
    {
        super("Menu");
        setLayout(new FlowLayout());
        buttonCreateAccout = new JButton("Add a new Account bank");
        buttonCreateAccout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                account = new BankAccount();
                add(buttonShowName);
                add(buttonGetBalance);
                add(buttonToDeposit);
                add(buttonWithdrawal);
                add(buttonHistory);
                revalidate();
            }
        });
        add(buttonCreateAccout);

        buttonShowName = new JButton("Show name");
        buttonShowName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                JOptionPane.showMessageDialog(null, account.getName());
            }
        });
        buttonGetBalance = new JButton("Get balance");
        buttonGetBalance.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                JOptionPane.showMessageDialog(null, account.getBalance());
            }
        });


        buttonToDeposit = new JButton("To deposit");
        buttonToDeposit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                resp = JOptionPane.showInputDialog("How much do you want to deposit?");
                balancehistory.addHistoryDeposit(resp);
                JOptionPane.showMessageDialog(null, account.toDeposit(Integer.parseInt(resp)));
            }
        });
        buttonWithdrawal = new JButton("Withdrawal");
        buttonWithdrawal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                resp = JOptionPane.showInputDialog("How much do you want to withdraw?");
                balancehistory.addHistoryWithdrawal(resp);
                JOptionPane.showMessageDialog(null, account.withdrawal(Integer.parseInt(resp)));
            }
        });

        buttonUnblock = new JButton("Unblock card");
        buttonUnblock.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                resp = JOptionPane.showInputDialog("How much do you want to deposit?");
                JOptionPane.showMessageDialog(null, account.unblock(Integer.parseInt(resp)));
            }
        });

        buttonHistory = new JButton("History Balance");
        buttonHistory.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                balancehistory.updateLabel();
                balancehistory.setSize(300, 400);
                balancehistory.setVisible(true);
            }
        });
    }
}
