package Bank;

import Account.Account;

public class UserDataManager
{
    private void checkBalance(Account account)
    {
        if (account.getBalance() < account.getSpecialWithdrawal() + 1)
        {
            account
        }
    }

    public String Deposit(int value)
    {
        if (!account.isBlock())
        {
            account.setBalance(account.getBalance()+value);
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
        if (!account.isBlock())
            if ((account.getSpecialWithdrawal() + account.getBalance() >= value) && !(value <= 0))
            {
                account.setBalance(account.getBalance()-value);
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
    public String unblock(int valor) //TODO Melhoria, controle de block e unblock do cartão
    {
        if (valor >= (Math.abs(account.getBalance() * 2)))
        {
            account.setBlock(false);
            return "Your card has been unblocked.";
        }
        else
        {
            return "Low amount to unblock.";
        }
    }
    public String getNameInterface() //TODO melhoria, mensagem
    {
        return String.format("Cards.Account owner %s", account.getName());
    }
    public String getBalanceInterface() // TODO melhoria, mensagem do else
    {
        if (!account.isBlock())
        {
            return String.format("$%d current balance", account.getBalance());
        }
        else
        {
            return "Cards.Account block!";
        }
    }
}