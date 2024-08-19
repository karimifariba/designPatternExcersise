package com.example.designpattern.adapter.state;

import com.example.designpattern.adapter.state.solution.DepositTransaction;
import com.example.designpattern.adapter.state.solution.WithdrawTransaction;

public class StatePattern {
    public static void main(String[] args) {
        /* manageTransaction(new DepositTransaction());*/

        /*    private static void manageTransaction(Transaction transaction) {

        transaction.getBalance(100000.0);
    }*/
        var account = new Account();
        account.setTransactionType(new DepositTransaction());
        account.getBalance(100000.0);
        account.returnTransactionType();

        account.setTransactionType(new WithdrawTransaction());
        account.getBalance(5000.0);
        account.returnTransactionType();

    }
}
