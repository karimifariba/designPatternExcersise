package com.example.designpattern.adapter.strategy.solution;

public class MiddleGrade implements CustomerGrade{
    @Override
    public void categorizeCustomerGrade(String customerName) {
        System.out.println(customerName+" categorized into Middle customer.");
    }
}
