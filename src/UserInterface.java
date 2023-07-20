import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame
{
    private JButton buttonCreateAccout,
                    buttonShowName;
    public UserInterface()
    {
        super("Menu");
        setLayout(new FlowLayout());
        buttonCreateAccout = new JButton("Adicionar uma conta");
        buttonCreateAccout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent ent){
                new BankAccount();
            }
        });
        add(buttonCreateAccout);

        buttonShowName = new JButton("Show Name");
        buttonShowName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent ent){
                JOptionPane.showMessageDialog(null, new BankAccount().getName());
            }
        });
        add(buttonShowName);
    }
}
