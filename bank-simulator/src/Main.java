import UI.Account;
import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        Account userinterface = new Account();
        userinterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userinterface.setSize(600, 150);
        userinterface.setVisible(true);
    }
}