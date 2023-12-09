package Agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private Scanner scanner = new Scanner(System.in);
    private String resp1, resp2, resp3, total;
    private ArrayList<String> tarefas;
    private int remover;
    public Agenda() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa()
    {
        System.out.printf("Digite o titulo :");
        resp1 = scanner.nextLine();
        System.out.printf("Digite o descricao :");
        resp2 = scanner.nextLine();
        System.out.printf("Digite o data :");
        resp3 = scanner.nextLine();
        total = "ID: " + (tarefas.size()+1) + " Titulo: " + resp1 + " Descrição: " + resp2 + " Data: " + resp3;
        tarefas.add(total);
    }
    public void removerTarefa()
    {
        System.out.printf("Digite o numero ID da tarefa: ");
        remover = scanner.nextInt();
        tarefas.remove((remover - 1));
    }
    public void mostrarAgenda()
    {
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(tarefas.get(i));
        }
    }
}
