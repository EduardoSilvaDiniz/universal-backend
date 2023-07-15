public class ContaBancaria
{
    public int saldo = 0;
    public boolean block = false;
    Historico historico = new Historico();
    Dados dados = new Dados();

    public void exibirSaldo()
    {
        if (!block)
        {
            System.out.println("Seu saldo é : " + this.saldo);
        }
        else
        {
            System.out.println("Não foi possivel verificar seu saldo pois sua conta foi bloqueada");
        }

    }
    public void depositar(int valor)
    {
        if (!block)
        {
            this.saldo += valor;
            historico.coletor(1, valor);
            System.out.println("Foi depositado : " + valor);
        }
        else
        {
            System.out.println("Não foi possivel fazer deposito pois seu cartão foi bloqueado");
        }
        verificar();
    }

    public void saque(int valor)
    {
        if (!block)
        {
            this.saldo -= valor;
            historico.coletor(0, valor);
            System.out.println("Foi sacado : " + valor);
        }
        else
        {
            System.out.println("Não foi possivel fazer saque pois seu cartão foi bloqueado");
        }
        verificar();
    }
    public void verificar()
    {
        if (this.saldo < 200)
        {
            block = true;
        }
    }
    public void desbloqueio(int valor) {
        if (valor >= (Math.abs(this.saldo * 2)))
        {
            block = false;
            System.out.println("seu cartão foi desbloqueado");
        }
        else
        {
            System.out.println("Valor baixo para desbloquear");
        }
    }
}