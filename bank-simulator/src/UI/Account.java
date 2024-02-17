package UI;

import Account.BalanceHistory;
import Bank.UserDataManager;
import javax.swing.*;
import java.awt.*;

public class Account extends JFrame //TODO opção de idioma pt-br/en-US
{
    private final JButton buttonShowName;
    private final JButton buttonGetBalance;
    private final JButton buttonGetDate;
    private final JButton buttonGetCardNumbers;
    private final JButton buttonGetSecureNumbers;
    private final JButton buttonToDeposit;
    private final JButton buttonWithdrawal;
    private final JButton buttonHistory;
    private final BalanceHistory balancehistory = new BalanceHistory();
    private String name;
    public Account(Account account)
    {
        super("Bank Simulator");
        setLayout(new FlowLayout());
        JButton buttonCreateAccount = new JButton("Add a new Cards.Account bank");
        buttonCreateAccount.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                name = JOptionPane.showInputDialog(null, "Whats is your name?");
                try
                {
                    if (name.matches("^[a-zA-Z]*$"))
                    {
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
                JOptionPane.showMessageDialog(null, UDM.getNameInterface(account));
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
                JOptionPane.showMessageDialog(null, account.account.getDate());
            }
        });

        buttonGetCardNumbers = new JButton("Get card numbers");
        buttonGetCardNumbers.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                JOptionPane.showMessageDialog(null, account.account.getCardNumbers());
            }
        });

        buttonGetSecureNumbers = new JButton("Get secure numbers");
        buttonGetSecureNumbers.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                JOptionPane.showMessageDialog(null, account.account.getSecureNumbers());
            }
        });

        buttonToDeposit = new JButton("Deposit");
        buttonToDeposit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                name = JOptionPane.showInputDialog("How much do you want to deposit?");
                try
                {
                    int test = Integer.parseInt(name);
                    if ( !(name.isEmpty()) && test > 0)
                    {
                        JOptionPane.showMessageDialog(null, account.Deposit(Integer.parseInt(name)));
                        balancehistory.addHistoryGeneric(name, account.getBalance(), "Deposit");
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
                name = JOptionPane.showInputDialog("How much do you want to withdraw?");
                try
                {
                    int test = Integer.parseInt(name);
                    if ( !(name.isEmpty()) && test > 0 && account.getBalance() >= test)
                    {
                        JOptionPane.showMessageDialog(null, account.withdrawal(Integer.parseInt(name)));
                        balancehistory.addHistoryGeneric(name, account.getBalance(), "Withdrawal");
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
                    int test = Integer.parseInt(name);
                    if ( !(name.isEmpty()) && test > 0)
                    {
                        name = JOptionPane.showInputDialog("How much do you want to deposit?");
                        JOptionPane.showMessageDialog(null, account.unblock(Integer.parseInt(name)));
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
