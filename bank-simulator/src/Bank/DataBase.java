package Bank;

import Account.Account;

import java.util.HashMap;

public class DataBase
{
    HashMap<Integer, Account> DB = new HashMap<Integer, Account>();
    public void addUser(String name, Integer id) //TODO adiciona testes
    {
        DB.put(id, new Account(name));
    }

}
