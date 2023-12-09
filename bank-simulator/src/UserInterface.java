import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame
{
    private final JButton buttonShowName;
    private final JButton buttonGetBalance;
    private final JButton buttonGetDate;
    private final JButton buttonGetCardNumbers;
    private final JButton buttonGetSecureNumbers;
    private final JButton buttonToDeposit;
    private final JButton buttonWithdrawal;
    private final JButton buttonHistory;
    private BankAccount account;
    private final BalanceHistory balancehistory = new BalanceHistory();
    private String resp;
    public UserInterface()
    {
        super("Bank Simulator");
        setLayout(new FlowLayout());
        JButton buttonCreateAccount = new JButton("Add a new Account bank");
        buttonCreateAccount.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                resp = JOptionPane.showInputDialog(null, "Whats is your name?");
                try
                {
                    if (resp.matches("^[a-zA-Z]*$"))
                    {
                        account = new BankAccount(resp);
                        buttonCreateAccount.setVisible(false);
                        add(buttonShowName);
                        add(buttonGetBalance);
                        add(buttonGetDate);
                        add(buttonGetCardNumbers);
                        add(buttonGetSecureNumbers);
                        add(buttonToDeposit);
                        add(buttonWithdrawal);
                        add(buttonHistory);
                        revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "value is invalid, only uppercase and lowercase letters");
                    }
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "value is invalid or null");
                }
            }
        });
        add(buttonCreateAccount);

        buttonShowName = new JButton("Show name");
        buttonShowName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                JOptionPane.showMessageDialog(null, account.getNameInterface());
            }
        });
        buttonGetBalance = new JButton("Get balance");
        buttonGetBalance.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                JOptionPane.showMessageDialog(null, account.getBalanceInterface());
            }
        });

        buttonGetDate = new JButton("Get date");
        buttonGetDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                JOptionPane.showMessageDialog(null, account.data.getDate());
            }
        });

        buttonGetCardNumbers = new JButton("Get card numbers");
        buttonGetCardNumbers.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                JOptionPane.showMessageDialog(null, account.data.getCardNumbers());
            }
        });

        buttonGetSecureNumbers = new JButton("Get secure numbers");
        buttonGetSecureNumbers.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                JOptionPane.showMessageDialog(null, account.data.getSecureNumbers());
            }
        });

        buttonToDeposit = new JButton("Deposit");
        buttonToDeposit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                resp = JOptionPane.showInputDialog("How much do you want to deposit?");
                try
                {
                    int test = Integer.parseInt(resp);
                    if ( !(resp.isEmpty()) && test > 0)
                    {
                        JOptionPane.showMessageDialog(null, account.toDeposit(Integer.parseInt(resp)));
                        balancehistory.addHistoryGeneric(resp, account.getBalance(), "Deposit");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "value is invalid, only positive numbers");
                    }
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "value is invalid or null");
                }
            }
        });
        buttonWithdrawal = new JButton("Withdrawal");
        buttonWithdrawal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                resp = JOptionPane.showInputDialog("How much do you want to withdraw?");
                try
                {
                    int test = Integer.parseInt(resp);
                    if ( !(resp.isEmpty()) && test > 0 && account.getBalance() >= test)
                    {
                        JOptionPane.showMessageDialog(null, account.withdrawal(Integer.parseInt(resp)));
                        balancehistory.addHistoryGeneric(resp, account.getBalance(), "Withdrawal");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "value is invalid, only positive numbers");
                    }
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "value is invalid or null");
                }
            }
        });

        JButton buttonUnblock = new JButton("Unblock card");
        buttonUnblock.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                try
                {
                    int test = Integer.parseInt(resp);
                    if ( !(resp.isEmpty()) && test > 0)
                    {
                        resp = JOptionPane.showInputDialog("How much do you want to deposit?");
                        JOptionPane.showMessageDialog(null, account.unblock(Integer.parseInt(resp)));
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "value is invalid, only positive numbers");
                    }
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "value is invalid or null");
                }
            }
        });

        buttonHistory = new JButton("History Balance");
        buttonHistory.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                balancehistory.updateLabel();
                balancehistory.setSize(600, 400);
                balancehistory.setVisible(true);
            }
        });
    }
}
