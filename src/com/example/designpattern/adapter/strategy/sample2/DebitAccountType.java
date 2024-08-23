package com.example.designpattern.adapter.strategy.sample2;

public class DebitAccountType implements AccountType{
    @Override
    public void doSomethingAsAccountType() {
        System.out.println("DEBIT account type is running");
    }
}
