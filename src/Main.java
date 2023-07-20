import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        UserInterface userinterface = new UserInterface();
        userinterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userinterface.setSize(300, 400);
        userinterface.setVisible(true);
    }
}

 /* ideias para melhorar esse projeto
    adicionar forma interativa de gerenciar a conta
    debico e credito,
    data de fechamento de fatura
    adicionar pagamento online com identificador da loja
    se possivel adicionar um simulador de aproximação
 */