package br.com.cobblebank;
import br.com.cobblebank.painel.AdminInterface;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        AdminInterface adminInterface= new AdminInterface();
        adminInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminInterface.setSize(600, 150);
        adminInterface.setVisible(true);
    }
}