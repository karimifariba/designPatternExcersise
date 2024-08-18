package com.example.designpattern.adapter.state.solution;

public interface Transaction {
    public void getBalance(Double amount );
    public void returnTransactionType();
}
