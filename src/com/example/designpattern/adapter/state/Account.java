package com.example.designpattern.adapter.state;

import com.example.designpattern.adapter.state.solution.Transaction;

public class Account {

    //    private Double balance = (double) 0;
    //    private TransactionType transactionType;
    private Transaction transaction;

    public Transaction getTransactionType() {
        return transaction;
    }

    public void setTransactionType(Transaction transaction) {
        this.transaction = transaction;
    }

/*    public void getBalance  (double amount) {
       if(transactionType==TransactionType.DEPOSIT) {
           balance-=  amount;
           System.out.println("The balance is: "+balance);
       }else {
           balance+=  amount;
           System.out.println("The balance is: "+balance);
       }
    }
    public void returnTransactionType(){
        if(transactionType==TransactionType.DEPOSIT) {
            System.out.println("The Transaction type is DEPOSIT");
        }else {
            System.out.println("The Transaction type is WITHDRAW");
        }
    }*/

    public void getBalance(double amount) {
        transaction.getBalance(amount);
    }

    public void returnTransactionType() {
        transaction.returnTransactionType();
    }
}
