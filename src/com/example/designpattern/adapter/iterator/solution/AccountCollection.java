package com.example.designpattern.adapter.iterator.solution;

import java.util.ArrayList;
import java.util.List;

public class AccountCollection {

    private List<String> accounts;

    {
        accounts = new ArrayList<>();
        System.out.println("List initialized");
    }

    public void pushAccount(String account) {
        accounts.add(account);
    }

    public String popAccount() {
        var currentAccount = accounts.getLast();
        accounts.removeLast();
        return currentAccount;
    }

    public Iterator<String> iterator() {
        return new AccountIterator(this);
    }

    public static class AccountIterator implements Iterator<String> {
        private final AccountCollection accountCollection;
        private int count;

        {
            count = 0;
        }

        public AccountIterator(AccountCollection accountCollection) {
            this.accountCollection = accountCollection;
        }

        @Override
        public Boolean hasNext() {
            return (count < accountCollection.accounts.size());
        }

        @Override
        public void next() {
            count++;
        }

        @Override
        public String currentItem() {
            return accountCollection.accounts.get(count);
        }
    }
}
