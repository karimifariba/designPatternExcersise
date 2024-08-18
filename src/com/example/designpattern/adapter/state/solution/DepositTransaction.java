package com.example.designpattern.adapter.state.solution;

import com.example.designpattern.adapter.state.Account;

public class DepositTransaction implements Transaction{
    private Double balance = (double) 0;
    private Account account;
    @Override
    public void getBalance(Double amount) {
        balance=balance+amount;
        System.out.println("The balance is :"+ balance);
    }

    @Override
    public void returnTransactionType() {
        System.out.println("return DEPOSIT Transaction type  ");
    }

}
