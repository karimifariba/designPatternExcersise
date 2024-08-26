package com.example.designpattern.adapter.strategy.sample2;

public class Blocked implements BlockedAccount {
    @Override
    public void doSomethingAsBlockedAccount() {
        System.out.println("BLOCKED account is running");
    }
}
