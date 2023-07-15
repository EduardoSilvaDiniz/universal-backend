public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.saque(200);
        conta1.exibirSaldo();
        conta1.desbloqueio(399);
        conta1.historico.exibir(conta1.historico.Historico_deposito, conta1.historico.Historico_deposito_datahora);
    }
}

 /* ideias para melhorar esse projeto
    adicionar forma interativa de gerenciar a conta
    debico e credito,
    data de fechamento de fatura
    adicionar pagamento online com identificador da loja
    se possivel adicionar um simulador de aproximação
 */