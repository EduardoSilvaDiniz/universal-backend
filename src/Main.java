import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        UserInterface userinterface = new UserInterface();
        userinterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userinterface.setSize(600, 150);
        userinterface.setVisible(true);
    }
}