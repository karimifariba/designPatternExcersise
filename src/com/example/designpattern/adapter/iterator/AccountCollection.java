package com.example.designpattern.adapter.iterator;

import java.util.ArrayList;
import java.util.List;

public class AccountCollection {
    private List<String> accounts;
//    private String[] accounts;

    static {
        System.out.println("Initializing AccountCollection");
    }

    {
//        accounts=new String[5];
        accounts = new ArrayList<>();
        System.out.println("List initialized");
    }

    public List<String> getAccounts() {
        return accounts;
    }
    public void pushAccount(String account) {
        accounts.add(account);
    }
    public String popAccount() {
        var currentAccount = accounts.get(accounts.size() - 1);
        accounts.remove(accounts.size() - 1);
        return currentAccount;
    }
}
