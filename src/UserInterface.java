import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame
{
    private JButton buttonCreateAccout,
                    buttonShowName,
                    buttonGetBalance,
                    buttonToDeposit,
                    buttonWithdrawal,
                    buttonUnblock;

    private BankAccount account;
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
                JOptionPane.showMessageDialog(null, account.toDeposit(Integer.parseInt(resp)));
            }
        });
        buttonWithdrawal = new JButton("Withdrawal");
        buttonWithdrawal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent ent)
            {
                resp = JOptionPane.showInputDialog("How much do you want to withdraw?");
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
    }
}
