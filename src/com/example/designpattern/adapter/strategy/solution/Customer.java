package com.example.designpattern.adapter.strategy.solution;

public class Customer {

  /*  private com.example.designpattern.adapter.sterategy.solution.CustomerType customerType;
    private com.example.designpattern.adapter.sterategy.solution.CustomerGrade customerGrade;

    public Customer(CustomerType customerType, CustomerGrade customerGrade) {
        this.customerType = customerType;
        this.customerGrade = customerGrade;
    }

    public void saveCustomer(String customerName) {
        customerType.categorizeCustomerType(customerName);

        customerGrade.categorizeCustomerGrade(customerName);

    }*/
    public void saveCustomer(String customerName,CustomerType customerType,CustomerGrade customerGrade) {
        customerType.categorizeCustomerType(customerName);

        customerGrade.categorizeCustomerGrade(customerName);

    }
}
