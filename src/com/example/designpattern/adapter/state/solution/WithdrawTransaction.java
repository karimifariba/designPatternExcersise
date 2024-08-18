package com.example.designpattern.adapter.state.solution;

public class WithdrawTransaction implements Transaction{
    private Double balance = (double) 0;
    @Override
    public void getBalance(Double amount) {
        balance=balance-amount;
        System.out.println("The balance is :"+ balance);
    }

    @Override
    public void returnTransactionType() {
        System.out.println("return WITHDRAW Transaction type  ");
    }
}
