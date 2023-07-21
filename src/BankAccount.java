public class BankAccount
{
    private int balance = 0,
                specialWithdrawal = 200;
    private boolean block = false;
    Data data = new Data();

    public String getBalance()
    {
        if (!block)
        {
            return String.format("$%d current balance", balance);
        }
        else
        {
            return "Account block!";
        }
    }
    public String toDeposit(int value)
    {
        if (!block)
        {
            balance += value;
            return String.format("$%d was deposited", value);
        }
        else
        {
            return "It was not possible to make a deposit because your card has been blocked.";
        }
    }

    public String withdrawal(int value)
    {
        checkBalance();
        if (!block)
            if ((specialWithdrawal + balance >= value) && !(value <= 0))
            {
                balance -= value;
                return String.format("$%d was withdrawn", value);
            }
            else
            {
                return "It was not possible to make the withdrawal.";
            }
        else
        {
            return "It was not possible to make a withdrawal because your card has been blocked.";
        }
    }
    public void checkBalance()
    {
        if (balance < -specialWithdrawal + 1)
        {
            block = true;
        }
    }
    public String unblock(int valor)
    {
        if (valor >= (Math.abs(balance * 2)))
        {
            block = false;
            return "Your card has been unblocked.";
        }
        else
        {
            return "Low amount to unblock.";
        }
    }
    public String getName()
    {
        return String.format("Account owner %s", data.name);
    }
}