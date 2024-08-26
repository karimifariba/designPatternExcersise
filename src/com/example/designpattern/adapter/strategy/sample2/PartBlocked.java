package com.example.designpattern.adapter.strategy.sample2;

public class PartBlocked implements BlockedAccount{
    @Override
    public void doSomethingAsBlockedAccount() {
        System.out.println("PART BLOCKED account is running");
    }
}
