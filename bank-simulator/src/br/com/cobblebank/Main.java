package br.com.cobblebank;

import br.com.cobblebank.account.UserAccount;
import br.com.cobblebank.api.AccountManager;
import br.com.cobblebank.painel.UserInterface;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        UserInterface userinterface = new UserInterface(new UserAccount("test"), new AccountManager());
        userinterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userinterface.setSize(600, 150);
        userinterface.setVisible(true);
    }
}