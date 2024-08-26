package com.example.designpattern.adapter.strategy.sample2;

public class example2 {
    public static void main(String[] args) {
        var account=new Account();
        account.doSomething(new CreditAccountType (),new Blocked());
        account.doSomething(new DebitAccountType (),new PartBlocked());
    }
}
