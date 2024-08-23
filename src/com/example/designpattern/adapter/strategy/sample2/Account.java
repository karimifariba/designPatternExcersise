package com.example.designpattern.adapter.strategy.sample2;

public class Account {

   void doSomething(AccountType accountType,BlockedAccount blockedAccount) {

       System.out.println("example 2 ");
       accountType.doSomethingAsAccountType();
       blockedAccount.doSomethingAsBlockedAccount();
       System.out.println("finish");
    }
}
