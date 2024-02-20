package br.com.cobblebank.painel;

import javax.swing.*;
import java.awt.*;

/**
 * essa classe é uma subclasse de JFrame e possui uma implementação da
 * interface UI.
 *
 * @author Eduardo Silva
 */
public class AdminInterface extends JFrame implements UI {
  public AdminInterface() {
    //instanciando a interface
    super("ADMIN");
    setLayout(new FlowLayout());

    //criando botão
    buttonsConstrutor();
  }

  /**
   * metodo que criar os botoçoes e adiciona ao painel
   *
   * @param name test
   */
  private void buttonsConstrutor(String name){
    JButton buttonShowName = new JButton("botão novo");
    buttonShowName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent ent) {
        JOptionPane.showMessageDialog(null, "a");
      }
    });

    add(buttonShowName);
  }
}
