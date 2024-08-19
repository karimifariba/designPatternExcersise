package com.example.designpattern.adapter.strategy.solution;

public class ValuableGrade implements CustomerGrade{
    @Override
    public void categorizeCustomerGrade(String customerName) {
        System.out.println(customerName+" categorized into Valuable customer.");
    }
}
