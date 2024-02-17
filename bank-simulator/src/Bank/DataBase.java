package Bank;

import Account.Account;

import java.util.HashMap;

public class DataBase
{
    HashMap<Integer, Account> whiteList = new HashMap<Integer, Account>();
    HashMap<Integer, Account> blackList = new HashMap<Integer, Account>();
    Integer idWhite = 0;
    Integer idBlack = 0;

    public void addUser(String name, Integer id) //TODO adiciona testes
    {
        whiteList.put(idWhite, new Account(name));
        idWhite++;
    }

    //TODO metodo para procurar o ID da conta na whitelist e blacklist e retornar qual ela faz parte
    public String seachID(Account account)
    {
        if (whiteList.containsValue(account)){
            return "white";
        } else if (blackList.containsValue(account)) {
            return "black";
        } else {
            return "null";
        }

    }

    //TODO metodo que move a conta do whilelist para blacklist e vise versa
    public void moveAccount(Account account)
    {
        if (whiteList.containsValue(account)){
            whiteList.remove(account);
            blackList.put(idWhite, account);
            idWhite--; idBlack++;
        } else if (blackList.containsValue(account)) {
            blackList.remove(account);
            whiteList.put(idBlack, account);
            idWhite++; idBlack--;
        }
    }
}
