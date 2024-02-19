package br.com.cobblebank.painel;

import javax.swing.*;
import java.awt.*;

public class AdminInterface extends JFrame {
  private final JButton buttonShowName;

  public AdminInterface {
    super("Bank Simulator");
    setLayout(new FlowLayout());
    add(buttonShowName);
  }
  buttonShowName = new JButton("Show name");
  public AdminInterface(JButton buttonShowName) {
  }
        buttonShowName.addActionListener(new java.awt.event.ActionListener()
}
