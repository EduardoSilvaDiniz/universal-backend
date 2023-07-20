public class BankAccount
{
    public int balance = 0;
    public boolean block = false;
    BalanceHistory balancehistory = new BalanceHistory();
    Data data = new Data();

    public void getBalance()
    {
        if (!block)
        {
            System.out.println("Seu saldo é : " + this.balance);
        }
        else
        {
            System.out.println("Não foi possivel verificar seu saldo pois sua conta foi bloqueada");
        }

    }
    public void deposite(int value)
    {
        if (!block)
        {
            this.balance += value;
            balancehistory.coletor(1, value);
            System.out.println("Foi depositado : " + value);
        }
        else
        {
            System.out.println("Não foi possivel fazer deposito pois seu cartão foi bloqueado");
        }
        checkBalance();
    }

    public void plunder(int value)
    {
        if (!block)
        {
            this.balance -= value;
            balancehistory.coletor(0, value);
            System.out.println("Foi sacado : " + value);
        }
        else
        {
            System.out.println("Não foi possivel fazer saque pois seu cartão foi bloqueado");
        }
        checkBalance();
    }
    public void checkBalance()
    {
        if (this.balance < 200)
        {
            block = true;
        }
    }
    public void unblock(int valor) {
        if (valor >= (Math.abs(this.balance * 2)))
        {
            block = false;
            System.out.println("seu cartão foi desbloqueado");
        }
        else
        {
            System.out.println("Valor baixo para desbloquear");
        }
    }
    public String getName()
    {
        return data.name;
    }
}