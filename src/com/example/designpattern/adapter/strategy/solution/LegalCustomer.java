package com.example.designpattern.adapter.strategy.solution;

public class LegalCustomer implements CustomerType {
    @Override
    public void categorizeCustomerType(String customerName) {
        System.out.println(customerName + " categorized into legal customer.");
    }
}
