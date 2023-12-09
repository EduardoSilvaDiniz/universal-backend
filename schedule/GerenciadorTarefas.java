import Agenda.Agenda;

import java.util.Scanner;

public class GerenciadorTarefas
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        Agenda agenda = new Agenda();
        while (running)
        {
            System.out.print("1.Abrir Agenda\n2.Adicionar Tarefa\n3.Remover Tarefa\n4.Fechar Agenda\nDigite um numero: ");
            int resp = input.nextInt();
            switch (resp)
            {
                case 1:
                    agenda.mostrarAgenda();
                    break;
                case 2:
                    agenda.adicionarTarefa();
                    break;
                case 3:
                    agenda.removerTarefa();
                    break;
                case 4:
                    System.out.println("Fechando Agenda!");
                    running = false;
                    break;
            }
        }
    }
}