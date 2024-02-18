package br.com.cobblebank.api;

import br.com.cobblebank.account.UserAccount;
import br.com.cobblebank.account.BalanceLog;

import java.util.HashMap;

public class DatabaseManager
{
    HashMap<Integer, UserAccount> whiteList = new HashMap<Integer, UserAccount>();
    HashMap<Integer, UserAccount> blackList = new HashMap<Integer, UserAccount>();
    Integer idWhite = 0;
    Integer idBlack = 0;

    public void addUser(String name, Integer id) //TODO adiciona testes
    {
        whiteList.put(idWhite, new UserAccount(name));
        idWhite++;
    }
    public UserAccount getAccount(Integer id) {

        return whiteList.get(id);
    }

    //TODO metodo para procurar o ID da conta na whitelist e blacklist e retornar qual ela faz parte
    public String seachID(UserAccount account)
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
    public void moveAccount(UserAccount account)
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
