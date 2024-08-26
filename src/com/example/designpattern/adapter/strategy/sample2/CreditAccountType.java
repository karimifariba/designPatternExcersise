package com.example.designpattern.adapter.strategy.sample2;

public class CreditAccountType implements AccountType{
    @Override
    public void doSomethingAsAccountType() {
        System.out.println("CREDIT account type is running");
    }
}
